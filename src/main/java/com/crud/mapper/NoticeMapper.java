package com.crud.mapper;

import java.util.List;

import com.crud.model.NoticeVO;

public interface NoticeMapper {
	// 공지사항 등록
	public void doWrite(NoticeVO notice);
	// 공지사항 게시글 불러오기
	public List<NoticeVO> getNotice();
	// 공지사항 상세정보 불러오기
	public NoticeVO getPage(int id);
	// 공지사항 수정
	public int doModify(NoticeVO notice);
	// 공지사항 삭제
	public int doDelete(int id);
}
