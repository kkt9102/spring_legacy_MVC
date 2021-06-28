package com.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 而⑦듃濡ㅻ윭 �꽕�젙
@Controller
// 怨듯닪 �슂泥� 寃쎈줈
@RequestMapping("/article/*")
public class ArticleController {
	
	private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
	
	@GetMapping("/list")
	public void showList() {
		return;
	}
}
