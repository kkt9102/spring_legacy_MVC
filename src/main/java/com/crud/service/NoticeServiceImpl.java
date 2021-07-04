package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.mapper.NoticeMapper;
import com.crud.model.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper mapper;
	// 공지사항 생성
	@Override
	public void doWrite(NoticeVO notice) {
		mapper.doWrite(notice);
	}
	// 공지사항 게시물 불러오기
	@Override
	public List<NoticeVO> getNotice() {
		return mapper.getNotice();
	}
//	공지사항 상세 불러오기 메소드 호출
	@Override
	public NoticeVO getPage(int id) {
		return mapper.getPage(id);
	}
// 공지사항 수정 메소드 호출
	@Override
	public int doModify(NoticeVO notice) {
		
		return mapper.doModify(notice);
	}
// 공지사항 삭제 메소드 호출
	@Override
	public int doDelete(int id) {

		return mapper.doDelete(id);
	}
}
