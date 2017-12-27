package com.taotao.shopping.dao;

import java.util.List;

import com.taotao.shopping.domain.Goods;

public interface IGoodsMapper {

	List<Goods> findAll();
}
