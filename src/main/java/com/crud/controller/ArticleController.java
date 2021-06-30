package com.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.model.ArticleVO;

// 해당 클레스는 컨트롤러
@Controller
// 공통 이동 페이지를 위한 RequestMapping
@RequestMapping("/article/*")
public class ArticleController {
	
	private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
	
	// 게시글 리스트 페이지 이동
	@GetMapping("/list")
	public void showList() {
		return;
	}
	
	// 게시글 생성 페이지 이동
	@GetMapping("/write")
	public void showWrite() {
		
	}
	// 게시글 생성 액션
	@PostMapping("/doWrite")
	public void doWrite(ArticleVO article) {
//		String regDate = 
		log.info("ArticleVO : " + article);
	}
}
