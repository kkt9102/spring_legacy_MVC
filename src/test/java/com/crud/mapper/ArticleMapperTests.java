package com.crud.mapper;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crud.model.ArticleVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ArticleMapperTests {
	private static final Logger log = LoggerFactory.getLogger(ArticleMapperTests.class);

	@Autowired
	private ArticleMapper mapper;

//	글등록 테스트
//	@Test
//	public void testDoWrite() {
//
//		ArticleVO vo = new ArticleVO();
//
//		//	NOT NULL 인 컬럼들.
//		vo.setTitle("mapper test");
//		vo.setBody("mapper test");
//		vo.setWriter("mapper test");
//
//		mapper.doWrite(vo);
//
//	}
	
// 게시물 불러오기 테스트
//	@Test
//	public void testGetArticle() {
//		
//		List list = mapper.getArticle();
//		// 향상된  for문
//		for(Object a : list) {
//			log.info("" + a);
//		}
//		// foreach&람다식
//		list.forEach(article -> log.info("" + article));
//	}
	
//	게시물 정보 불러오기 테스트
	@Test
	public void testGetPage() {
		int id = 5;
		log.info("" + mapper.getPage(id));
	}
}
