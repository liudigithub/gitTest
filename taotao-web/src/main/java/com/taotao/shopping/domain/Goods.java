package com.taotao.shopping.domain;

public class Goods {

	private long id;
	private String goodsName;
	private String goodsFrom;
	private String introduce;
	private String pirture;
	private long nowPrice;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsFrom() {
		return goodsFrom;
	}
	public void setGoodsFrom(String goodsFrom) {
		this.goodsFrom = goodsFrom;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getPirture() {
		return pirture;
	}
	public void setPirture(String pirture) {
		this.pirture = pirture;
	}
	public long getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(long nowPrice) {
		this.nowPrice = nowPrice;
	}
	
}
