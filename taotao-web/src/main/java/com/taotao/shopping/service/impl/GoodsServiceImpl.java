package com.taotao.shopping.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.domain.Resource;
import com.taotao.shopping.dao.IGoodsMapper;
import com.taotao.shopping.domain.Goods;
import com.taotao.shopping.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private IGoodsMapper igoodsMapper;
	@Autowired
	private SolrServer solrServer;
	
	@Override
	public Resource createGoods() throws Exception {
		List<Goods> goodsList=igoodsMapper.findAll();
		for (Goods goods : goodsList) {
			//创建一个文档对象
	        SolrInputDocument document = new SolrInputDocument();
	        //向文档中添加域
	        document.addField("id", goods.getId());
	        document.addField("item_title", goods.getGoodsName());
	        document.addField("item_sell_point", goods.getGoodsFrom());
	        document.addField("item_price", goods.getNowPrice());
	        document.addField("item_image", goods.getPirture());
	        document.addField("item_desc", goods.getIntroduce());
	        //把文档添加到索引库
	        solrServer.add(document);
		}
		//提交
		solrServer.commit();
		return new Resource();
	}

	@Override
	public Resource findGoods(String q, int rows, int page) throws Exception {
		//创建一个查询对象
        SolrQuery query = new SolrQuery();
        //设置查询条件
        query.setQuery(q);
        query.setStart(page*rows);
        query.setRows(rows);
        //设置默认搜索域
        query.set("df", "item_keywords");
        //设置高亮显示
        query.setHighlight(true);
        query.addHighlightField("item_title");
        query.setHighlightSimplePre("<em style=\"color:red\">");
        query.setHighlightSimplePost("</em>");
        //执行查询
        QueryResponse response = solrServer.query(query);
        //取高亮显示
        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
        //取查询结果
        SolrDocumentList solrDocumentList = response.getResults();
        System.out.println("共查询到记录：" + solrDocumentList.getNumFound());
        List<Goods> goodsList=new ArrayList<Goods>();
        for (SolrDocument solrDocument : solrDocumentList) {
        	Goods goods=new Goods();
        	goods.setId(Long.parseLong((String) solrDocument.get("id")) );
            //取高亮显示的结果
            List<String> list = highlighting.get(solrDocument.get("id")).get("item_title");
            String title = "";
            if (list != null && list.size()>0) {
                title = list.get(0);
            } else {
                title = (String) solrDocument.get("item_title");
            }
            goods.setGoodsName(title);
            goods.setGoodsFrom((String) solrDocument.get("item_sell_point"));
            if(solrDocument.get("item_price")!=null){
            	Object price = solrDocument.get("item_price");
            	goods.setNowPrice(Long.parseLong(price.toString()));
            }
            goods.setPirture((String) solrDocument.get("item_image"));
            goodsList.add(goods);
        }
        Resource rs=new Resource();
        rs.setData(goodsList);
		return rs;
	}

}
