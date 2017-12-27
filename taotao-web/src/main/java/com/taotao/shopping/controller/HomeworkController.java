package com.taotao.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.domain.model.TbAffiche;
import com.taotao.shopping.service.HomeworkService;

@Controller
public class HomeworkController {

	@Autowired
	private HomeworkService homeworkService;
	
	@RequestMapping("/find")
	@ResponseBody
	public TbAffiche find(){
		return homeworkService.find();
	}
}
