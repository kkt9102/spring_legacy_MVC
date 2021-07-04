package com.crud.service;

import java.util.List;

import com.crud.model.NoticeVO;

public interface NoticeService {
	// 공지사항 등록
	public void doWrite(NoticeVO notice);
	// 공지사항 게시물 불러오기
	public List<NoticeVO> getNotice();
	// 공지사항 정보 불러오기
	public NoticeVO getPage(int id);
	// 공지사항 수정
	public int doModify(NoticeVO notice);
	// 공지사항 삭제
	public int doDelete(int id);
}
