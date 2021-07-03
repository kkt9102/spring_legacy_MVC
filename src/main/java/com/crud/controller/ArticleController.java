package com.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.model.ArticleVO;
import com.crud.service.ArticleService;

// 해당 클레스는 컨트롤러
@Controller
// 공통 이동 페이지를 위한 RequestMapping
@RequestMapping("/article/*")
public class ArticleController {
	
	// ArticleService 의존성 주입
	@Autowired
	private ArticleService articleService;
	
	private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
	
	// 게시글 리스트 페이지 이동
	@GetMapping("/list")
	public void showList(Model model) {
		model.addAttribute("article",articleService.getArticle());
	}
	
	// 게시글 생성 페이지 이동
	@GetMapping("/write")
	public void showWrite() {
		
	}
	// 게시글 생성 액션
	@PostMapping("/doWrite")
	public String doWrite(ArticleVO article) {
//		String regDate = 
		log.info("ArticleVO : " + article);
		
		// articleService에 전달받은 ArticleVO를 삽입
		articleService.doWrite(article);
		// 글 작성 후 자동으로 게시물 리스트페이지로 호출
		return "redirect:/article/list";
	}
	
	// 게시글 상세페이지 이동
	@GetMapping("/detail")
	public void showDetail(int id, Model model) {
		model.addAttribute("detail",articleService.getPage(id));
	}
	
	// 게시글 수정 페이지 이동
	@GetMapping("/modify")
	public void showModify() {
		
	}
}
