package com.taotao.shopping.service;

import com.taotao.common.domain.Resource;

public interface GoodsService {

	Resource createGoods() throws Exception;

	Resource findGoods(String q, int rows, int page) throws Exception;
}
