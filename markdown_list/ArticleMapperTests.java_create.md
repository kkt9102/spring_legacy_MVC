## ArticleMapperTests.java 테스트용 코드 작성
	package com.crud.mapper;
	
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
	
		@Test
		public void testDoWrite() { {
	
			ArticleVO vo = new ArticleVO();
	
			vo.setTitle("mapper test");
			vo.setBody("mapper test");
			vo.setWriter("mapper test");
	
			mapper.doWrite(vo);
	
		}
	}
