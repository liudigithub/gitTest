package com.taotao.shopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.domain.dao.TbAfficheMapper;
import com.taotao.domain.model.TbAffiche;
import com.taotao.shopping.service.HomeworkService;


@Service
public class HomeworkServiceImpl implements HomeworkService {

	@Autowired
	private TbAfficheMapper tbAfficheMapper;
	
	@Override
	public TbAffiche find() {
		return tbAfficheMapper.selectByPrimaryKey(9);
	}

}
