package com.crud.mapper;

import java.util.List;

import com.crud.model.ArticleVO;

public interface ArticleMapper {
	// 게시글 등록
	public void doWrite(ArticleVO article);
	// 게시글 가저오기
	public List<ArticleVO> getArticle();
}
