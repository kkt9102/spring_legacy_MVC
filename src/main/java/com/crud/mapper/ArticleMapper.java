package com.crud.mapper;

import com.crud.model.ArticleVO;

public interface ArticleMapper {
	// 게시글 등록
	public void doWrite(ArticleVO article);
}
