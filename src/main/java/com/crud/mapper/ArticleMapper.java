package com.crud.mapper;

import java.util.List;

import com.crud.model.ArticleVO;

public interface ArticleMapper {
	// 게시글 등록
	public void doWrite(ArticleVO article);
	// 게시글 리스트 불러오기
	public List<ArticleVO> getArticle();
	// 게시글 상세정보 불러오기
	public ArticleVO getPage(int id);
}
