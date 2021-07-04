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
	// 게시글 수정
	// doModify를 int로 설정한 이유는 수정 성공 시 값이 1, 실패 시 0으로 표기하기위함
	public int doModify(ArticleVO article);
	// 게시글 삭제
	public int doDelete(int id);
}
