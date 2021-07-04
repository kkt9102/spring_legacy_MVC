package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/notice/*")
@Controller
public class NoticeController {
	// 공지사항 리스트 페이지 이동
	@GetMapping("/list")
	public void showList() {
		
	}
	
	// 공지사항 게시물 생성 페이지 이동
	@GetMapping("/write")
	public void showWrite() {
		
	}
	// 공지사항 게시물 생성 액션
	@PostMapping("/doWrite")
	public void doWrite() {
		
	}
}
