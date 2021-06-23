package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 컨트롤러 설정
@Controller
// 공툥 요청 경로
@RequestMapping("/article/")
public class ArticleController {
	
	@GetMapping("/list")
	public String showList() {
		return "article/list";
	}
}
