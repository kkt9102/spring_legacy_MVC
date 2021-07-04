package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crud.model.NoticeVO;
import com.crud.service.NoticeService;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	// 공지사항 리스트 페이지 이동
	@GetMapping("/list")
	public void showList(Model model) {
		model.addAttribute("notice", noticeService.getNotice());
	}
	
	// 공지사항 게시물 생성 페이지 이동
	@GetMapping("/write")
	public void showWrite() {
		
	}
	// 공지사항 게시물 생성 액션
	@PostMapping("/doWrite")
	public String doWrite(NoticeVO notice) {
		noticeService.doWrite(notice);
		
		return "redirect:/notice/list";
	}
	
	// 공지사항 상세페이지 이동
	@GetMapping("/detail")
	public void showDetail(int id, Model model) {
		model.addAttribute("detail",noticeService.getPage(id));
	}
	
	// 공지사항 수정 페이지 이동
	@GetMapping("/modify")
	public void showModify(int id, Model model) {
		model.addAttribute("detail",noticeService.getPage(id));
	}
	// 공지사항 수정 액션
	@PostMapping("/doModify")
	public String doModify(NoticeVO notice, RedirectAttributes rttr) {
		noticeService.doModify(notice);
		
		rttr.addFlashAttribute("result","modify success");
		return "redirect:/notice/list";
	}
	
	// 공지사항 삭제 액션
	@PostMapping("/doDelete")
	public String doDelete(int id, RedirectAttributes rttr) {
		noticeService.doDelete(id);
		
		rttr.addFlashAttribute("result","delete success");
		return "redirect:/notice/list";
	}
}
