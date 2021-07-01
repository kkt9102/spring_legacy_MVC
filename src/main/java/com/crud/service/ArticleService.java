package com.crud.service;

import java.util.List;

import com.crud.model.ArticleVO;

public interface ArticleService {
	// 게시글 등록 메서드
	public void doWrite(ArticleVO article);
	// 게시글 불러오기
	public List<ArticleVO> getArticle(); 
}
