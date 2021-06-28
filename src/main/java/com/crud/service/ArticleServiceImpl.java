package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.mapper.ArticleMapper;
import com.crud.model.ArticleVO;

// ArticleService.java 인터페이를 구현하는 클레스임
@Service
// ArticleServiceImpl은 ArticleService의 서비스 역할을 함
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper mapper;
	
	//ArticleService 인터페이스에서 선언한 메서드를 오버라이딩하여 메서드의 구현부 작성. 구현부에는 ArticleMapper의 doWrite() 메서드를 호출 하는 코드 작성
	@Override
	public void doWrite(ArticleVO article) {
		mapper.doWrite(article);
	}
}
