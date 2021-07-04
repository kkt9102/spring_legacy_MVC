package com.crud.service;

import java.util.List;

import com.crud.model.ArticleVO;

public interface ArticleService {
	// 게시글 등록 메서드
	public void doWrite(ArticleVO article);
	// 게시글 리스트 불러오기
	public List<ArticleVO> getArticle();
	// 게시글 정보 불러오기
	public ArticleVO getPage(int id);
	// 게시글 수정
	public int doModify(ArticleVO article);
	// 게시글 삭제
	public int doDelete(int id);
}
