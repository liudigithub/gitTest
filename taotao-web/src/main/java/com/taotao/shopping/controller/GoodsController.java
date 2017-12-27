package com.taotao.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.domain.Resource;
import com.taotao.shopping.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/createGoods")
	@ResponseBody
	public Resource create(){
		Resource re = null;
		try {
			re = goodsService.createGoods();
		} catch (Exception e) {
			re.setCode(500);
			re.setMessage(e.getMessage());
		}
		
		return re;
	}
	@RequestMapping("/findGoods")
	@ResponseBody
	public Resource find(@RequestParam()String q,@RequestParam(defaultValue="5")int rows,@RequestParam(defaultValue="0")int page){
		Resource re = null;
		if("".equals(q)){
			re = new Resource();
			re.setCode(1);
			re.setMessage("查询条件不能为空");
			return re;
		}
		try {
			re = goodsService.findGoods(q,rows,page);
		} catch (Exception e) {
			re.setCode(500);
			re.setMessage(e.getMessage());
		}
		
		return re;
	}
}
