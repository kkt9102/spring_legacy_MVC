# spring_legacy_MVC
(sample)Spring_legacy_MVC_project

## 1. 프로젝트 최초 생성
	- New > Spring > Spring Legacy > Spring MVC 
---

## 2. porm.xml 수정
[코드 보러가기](markdown_list/porm.xml_change.md)  
	- 변경된 부분은 체크해놓음
	
## 3. 여러 프로젝트가 있을 때 local용 tomcat 설정
<div>
<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/1.png" style="width:750px;">
<br>
<p style="padding-bottom:30px;">1. 해당 프로젝트를 우클릭 후 'Run As > Run on Server'를 클릭하여 서버설정으로 이동</p>
<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/2.png" style="width:750px;">
<br>
<p style="padding-bottom:30px;">2. 사용할 tomcat 버전 선택 후 'Next' 클릭</p>
<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/3.png" style="width:750px;">
<br>
<p style="padding-bottom:30px;">3. local로 운영할 프로젝트를 제외한 다른 프로젝트는 'remove'로 제외</p>
</div>
---

## 4. 한글 필터링 추가
[변경부분 보러가기](https://github.com/kkt9102/spring_legacy_MVC/commit/0aef2f0afbdf6190d2c49060751a5e70269f00c2#diff-f1c1b2e33984786db489cb4229fb7610cabae6dc83df075488c9e1236a91268c)

---

## 5. 기본 include 준비
	-home.jsp에 각 페이지별 식별을 위한 임시 title 설정
``` html
	<!-- include(공통)파일 연결해주기 -->
	<%@ include file="include/header.jsp" %>
```
```html
	<!-- 임시 페이지 구분용 title 달기 -->
	<!-- 변수 설정 -->
	<c:set var="title" value="메인페이지" />

	<!-- 변수값 출력 -->
	<c:out value="${title}" />
	<div>${title}</div>
```

---

## 5. ArticleController(게시글 관련 컨트롤러) 생성
	- src > main > java > com > crud > controller 안에 ArticleController.java 생성
<div>
<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/4.png" style="width:750px;">
<br>
<p style="padding-bottom:30px;">1. 해당 프로젝트에서 'com.crud.controller' 우클릭 후 New > Class'를 클릭하여 클레스 생성으로 이동</p>
<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/5.png" style="width:750px;">
<br>
<p style="padding-bottom:30px;">2. 사진과 같이 클레스명에'ArticleController' 입력</p>
<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/6.png" style="width:750px;">
<br>
<p style="padding-bottom:30px;">3. 클레스 생성 완료</p>
</div>

---

## 6. ArticleController를 이용해 추가 페이지 출력 확인
	- src > main > webapp > views > article(폴더추가) > list.jsp 생성
```java
	package com.crud.controller;
	
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	
	
	@Controller
	@RequestMapping("/article/")
	public class ArticleController {
		
		@GetMapping("/list")
		public String showList() {
			return "article/list";
		}
	}
```

---

## 7. porm.xml에 mysql연결을 위한 라이브러리 추가
	- porm.xml 에 해당 라이브러리 추가
	```java
	<!-- mysql -->
		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.23</version>
		</dependency>
	```
	
---

## 8. 기존 log4j 제거 혹은 주석 처리후 다른 버전 추가, spring-test 추가
[코드 보러가기](markdown_list/porm.xml_log4j_edit.md)  
	- 변경된 부분은 체크해놓음
	
---

## 9. junit버전 변경
	- porm.xml 에 junit 라이브러리버전을 4.7에서 4.12로 변경
	
---

## 10. 커넥션 풀(HikariCP) 라이브러리 추가 및 설정
[코드 보러가기](markdown_list/porm.xml_hikari_add.md)  
	- 변경된 부분은 체크해놓음
	
---

## 11. JDBCTest.java를 통한 DB 접속 테스트
<div>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/7.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">1. src > test > java > com > crud > persistence(폴더 생성) > JDBCTest.java 추가</p>
	<p style="padding-bottom:30px;">2. JDBCTest.java에 테스트를 위한 코드 작성</p>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/8.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">2. 코드 작성 후 테스트 진행</p>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/9.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">3. 테스트 진행 후 정상작동 확인</p>
</div>

[코드 보러가기](markdown_list/JDBCTest.java_write.md)

---

## 12. root-context.xml 에 db접속을 위한 코드 작성
	- src > main > webapp > WEB-INF > spring > root-context.xml 에 코드 추가
[코드 보러가기](https://github.com/kkt9102/spring_legacy_MVC/commit/652f5329a6c0c3d6cfaac00ae4de47930b524ee6)

---

## 13. DataSourceTest.java 를 통한 DB연결 테스트
	- src > test > java > com > crud > persistence > DataSourceTest.java 추가 및 코드작성
[코드 보러가기](markdown_list/DataSourceTest.xml_write.md)

---

## 14. porm.xml에 mybatis 라이브러리 추가
[코드 보러가기](markdown_list/porm.xml_mybatis_add.md)  
	- 변경된 부분은 체크해놓음
	
---

## 15. root-context.xml에 SQLSessionFactory 추가
[코드 보러기가](markdown_list/root-context.xml_add_SQLSessionFactory.md)  
	- 변경된 부분은 체크해놓음
	
---

## 16. DataSourceTest.java를 통한 SQLSessionFactory 테스트
[코드 보러기가](markdown_list/DataSourceTest.xml_add_session.md)  
	- 변경된 부분은 체크해놓음
	
---

## 17. DB 작성
[코드 보러가기](markdown_list/sql_ver_1.md)
	- 작성된 sql문은 이 프로젝트 기준
	
---

## 18. 게시판 등록 기능을 위한 기본개념 잡기
<div>
	<p style="font-size:1.4rem; text-align: center;">CRUD 기본 작동원리</p>
	<img style="width:750px;" title="출처:https://kimvampa.tistory.com/163?category=843151" src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FszJlt%2FbtqXrD9y46b%2FhdPCNUwHOnSn9Vkpp4Bx6k%2Fimg.png" />
	<br>
	<a href="https://kimvampa.tistory.com/163?category=843151" target="_blank">출처 블로그 바로가기</a>
	<br>
	<strong>간단한 설명</strong>
	<p>1. 사용자가 .jsp로 접속하여 화면을 요청</p>
	<p>2. 요청받은 정보가 Controller가 요청을 접수 후 해당 요청을 Service에게 전달</p>
	<p>3. Service는 받은 요청을 DAO에게 전달</p>
	<p>4. DAO는 요청받은 정보를 DB에서 가져와 다시 Service에게 전달</p>
	<p>5. Service는 받은 정보를 다시 Controller에게 전달한다.</p>
	<p>6. Controller는 받은 정보를 jsp에게 전달하여 최종적으로 사용자에게 보여진다</p>
	<div style="transform:scale(0.2);">기본원리를 자꾸 까먹는다... 기억해야하는데... 아니 익숙해질때가 됬는데... ㅠㅠㅠ</div>
</div>

---

## 19. 게시판 등록 기능을 위한 기초 작업
	- src > main > java > com > crud > mapper 생성
	- src > main > java > com > crud > model 생성
	- src > main > java > com > crud > service 생성
<div>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/10.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">1. com.crud.controller 를 우클릭하여 'NEW > Pakage' 를릭</p>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/11.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">2. 위의 사진처럼 각각 필요한 패키지명 입력 후 생성</p>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/12.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">3. 필요한 패키지 (mapper,model,service) 생성이 완료된 후의 모습</p>
	<br>
	<p>root-context.xml에 생성한 패키지 인식을 위한 경로 추가</p>
	<a href="https://github.com/kkt9102/spring_legacy_MVC/commit/f937a9c6d39b876137e967dac63b73d3a37c840f#diff-ff64cd32bff477b80394c42a5718de4ca41f41b30a5a888c6eca37140c19b3fd">추가한 코드 보러가기(패키지 인식경로)</a>
</div>

---

## 20. com.crud.model에 ArticleVO.java 추가
<div>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/13.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">1. com.crud.model 를 우클릭하여 'NEW > Class' 를릭</p>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/14.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">2. 위의 사진처럼 ArticleVO를 입력 후 생성</p>
</div>

---

## 21. ArticleVO.java 안에 class 생성
<div>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/15.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">1. ArticleVO.java에 DB에 생성한 컬럼정보 입력</p>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/16.png" style="width:750px;">
	<br>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/17.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">2. 'Getters and Setters' 생성</p>
	<br>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/18.png" style="width:750px;">
	<br>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/19.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">3. 'toString' 생성</p>
</div>

[코드 보러가기](markdown_list/ArticleVO.java_.md)

---

## 22. com.crud.maooer에 ArticleMapper.java 추가
<div>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/20.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">1. com.crud.mapper 를 우클릭하여 'NEW > Class' 를릭</p>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/21.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">2. 위의 사진과 같이 ArticleMapper 입력 후 생성</p>
</div>

---

## 23. ArticleMapper.java에 게시글 작성을 위한 코드 추가
```java
	package com.crud.mapper;
	
	import com.crud.model.ArticleVO;
	
	public interface ArticleMapper {
		// 게시글 등록
		public void doWrite(ArticleVO article);
	}
```

<div>
	<a href="https://myjamong.tistory.com/150" target="_blacnk">참고 : class와 interface의 차이를 보기쉽게 설명한 블로그</a>
</div>
---

## 24. ArticleMapper.xml 추가하기
<div>
	<img src="https://kkt9102.github.io/img2/spring_legacy_ver_2/22.png" style="width:750px;">
	<br>
	<p style="padding-bottom:30px;">ArticleMapper.java 와 같은 경로, 같은 파일명으로 xml파일을 생성해준다.(위의 사진 참조)</p>
</div>

---

## 25. ArticleMapper.xml 코드 작성
```java
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE mapper
		PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
		"http://mybatis.org/dtd.mybatis-3-mapper.dtd">
		
		<mapper namespace="com.curd.mapper.ArticleMapper">
		<!-- 게시글 작성 -->
		<insert id="doWrite">
			INSERT INTO crud_article
			SET regDate = NOW(),
			updateDate = NOW(),
			title = #{title},
			body = #{body},
			writer = #{writer}
	</insert>
		</mapper>
```
	- ArticleMapper.xml에 게시글 생성 시 필요한 sql문을 입력한다.

---

## 26. ArticleMapperTests.java를 통한 테스트
[코드 보러가기](markdown_list/ArticleMapperTests.java_create.md)

	- 테스트코드로 테스트 실행 후 데이터가 들어갔는지 확인

---

## 27. ArticleService.java 생성 및 코드 작성
	- src > main > java > com > crud > service > ArticleService.java 생성
```java
	package com.crud.service;
	
	import com.crud.model.ArticleVO;
	
	public interface ArticleService {

		public void doWrite(ArticleVO article);
	}
```
	
---

## 28. ArticleServiceImpl.java 생성 및 코드 작성
	- src > main > java > com > crud > service > ArticleServiceImpl.java 생성
```java
	package com.crud.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.crud.mapper.ArticleMapper;
	import com.crud.model.ArticleVO;
	
	@Service
	public class ArticleServiceImpl implements ArticleService {
		@Autowired
		private ArticleMapper mapper;
		
		@Override
		public void doWrite(ArticleVO article) {
			mapper.doWrite(article);
		}
	}
```

---

## 29. ArticleController.java에 게시물 리스트 및 게시물 작성 페이지 이동을 위한 메서드 등록
```java
	package com.crud.controller;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	
	@Controller
	@RequestMapping("/article/*")
	public class ArticleController {
	
	private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
	
	// 게시글 리스트 페이지 이동
	@GetMapping("/list")
	public void showList() {
		return;
	}
	
	// 게시글 생성 페이지 이동
	@GetMapping("/write")
	public void showWrite() {
		return;
	}
	// 게시글 생성 액션
	@PostMapping("/doWirte")
	public void doWrite() {
	// jsp 에서 글 작성 액션을 취하면 콘솔창에 정보가 남는다.
		log.info("ArticleVO : " + article);
	}
}
```

---

## 30. 게시글 생성 페이지 (write.jsp) 간단한 퍼블리싱 작업
	- src > main > webapp > WEB-INF > views > article > list.jsp 추가
	- src > main > webapp > WEB-INF > views > article > wrtie.jsp 추가
**파일 경로의 경우 ArticleController와 같이 맞춰우어야한다. (@RequestMapping 이 article이라면 article 폴더 안에 해당 jsp 생성)**

---

## 31. 게시글 생성 페이지 (write.jsp) 코드
```html
	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl core -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page session="false" %>

	<%@ include file="../include/header.jsp" %>

	<c:set var="title" value="새 글쓰기" />
	
	<section id="body">
		<div>${title}</div>
		
		<div class="write_form_box">
			<form action="/article/doWrite" method="post" id="write_form">
				<div class="title_input">
					<input type="text" name="title" placeholder="제목을 입력해주세요."/>
				</div>
				<div class="body_input">
					<textarea name="body" id="" cols="30" rows="10" placeholder="내용을 입력해주세요."></textarea>
				</div>
			</form>
			<div class='btn_box'>
				<a href="javascript:void(0);" id="write_btn">글쓰기</a>
				<a href="" id="cencle_btn">취소</a>
			</div>
		</div>
	</section>
	<script>
		$('#write_btn').click(function(e){
			var form = $('#write_form');
			form.attr("method","post");
			form.submit();
		})
		
	</script>
	<%@ include file="../include/footer.jsp" %>
```

---

## 32. ArticleController.java 작성
```java
	package com.crud.controller;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	
	import com.crud.model.ArticleVO;
	import com.crud.service.ArticleService;
	
	// 해당 클레스는 컨트롤러
	@Controller
	// 공통 이동 페이지를 위한 RequestMapping
	@RequestMapping("/article/*")
	public class ArticleController {
		
		// ArticleService 의존성 주입
		@Autowired
		private ArticleService articleService;
		
		private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
		
		// 게시글 리스트 페이지 이동
		@GetMapping("/list")
		public void showList() {
			return;
		}
		
		// 게시글 생성 페이지 이동
		@GetMapping("/write")
		public void showWrite() {
			
		}
		// 게시글 생성 액션
		@PostMapping("/doWrite")
		public String doWrite(ArticleVO article) {
	//		String regDate = 
			log.info("ArticleVO : " + article);
			
			// articleService에 전달받은 ArticleVO를 삽입
			articleService.doWrite(article);
			// 글 작성 후 자동으로 게시물 리스트페이지로 호출
			return "redirect:/article/list";
		}
	}

```

---

## 33. 게시글 목록 구현 을 위한 기본작업
	- ArticleMapper.java에 메서드 추가
```java
	public List<ArticleVO> getArticle();
```

---

## 34. ArticleMapper.xml에 게시글 목록 구현을 위한 sql문 작성
	- ArticleMapper.xml에 sql문 추가
```java
	<select id="getArticle" resultType="com.crud.model.ArticleVO">
		SELECT * FROM crud_article 
	</select>
```

---

## 35. ArticleMapperTests.java로 테스트 진행
	- ArticleMapperTests.java에 기존에 작성한 테스트 부분은 주석처리 혹은 삭제 후 진행
```java
		@Test
	public void testGetArticle() {
		
		List list = mapper.getArticle();
		// 향상된  for문
		for(Object a : list) {
			log.info("" + a);
		}
		// foreach&람다식
		list.forEach(article -> log.info("" + article));
	}
```

---

## 36. ArticleController.java 에서 list 부분에 Model 파라미터 추가
```java
	// 변경전 코드
		@GetMapping("/list")
	public void showList() {
		return;
	}
	
	// 변경후 코드
		@GetMapping("/list")
	public void showList(Model model) {
		model.addAttribute("article",articleService.getArticle());
	}
```

---

## 37. list.jsp에 게시글 정보 불러오기(뿌리기!)
```html
	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl core -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<c:set var="title" value="게시물 리스트" />

<section id="body">
	<div>${title}</div>
	
	<a href="write" class="btn">새 글쓰기</a>

 	<c:forEach items="${article}" var="article">
		<div>
			<c:out value="${article.title}"/>
		</div>
	</c:forEach>
</section>
```

---

## 38. list.jsp에서 해당 글을 클릭 시 글 상세페이지로 이동하게 설정
[코드 보러가기](markdown_list/list.jsp_edit.md)

---

## 39. 게시글 상세정보를 불러오기 위해 ArticleMapper.java에 변수 추가하기
```java
	public ArticleVO getPage(int id);
```

---

## 40. 게시글 상세정보를 불러오기 위한 ArticleMapper.xml에 sql문 추가하기
	- ArticleMapper.xml 에 게시물의 정보 (선택한 1개의 게시물 정보)를 불러올 sql문을 작성한다.
```xml
	<!-- 게시글 상세정보 불러오기 -->
	<select id="getPage" resultType="com.crud.model.ArticleVO">
		SELECT * FROM crud_article
		WHERE id = #{id}
	</select>
```

---

## 41. ArticleMapperTests.java를 통해서 글이 불러와지는지 테스트 진행
	- 테스트를 위한 코드 입력
```java
	//	게시물 정보 불러오기 테스트
	@Test
	public void testGetPage() {
		int id = 5;
		log.info("" + mapper.getPage(id));
	}
```

---

## 42. ArticleController.java에 해당 게시물의 정보를 담아서 보여주기
	-변경 전 코드
```java
		@GetMapping("/detail")
		public void showDetail() {
		
	}
```
	-변경 후 코드
```java
		@GetMapping("/detail")
		public void showDetail(int id, Model model) {
		model.addAttribute("detail",articleService.getPage(id));
	}
```

---

## 43. detail.jsp에 선택한 게시글의 정보보여주기 퍼블리싱
[코드 보러가기](markdown_list/detail.jsp_custom.md)

---

## 44. detail.jsp에서 '수정' 클릭 시 해당 게시물의 id값을 가진 modify로 이동 설정하기
[코드 보러가기]()


## 00. spring MVC 에 stylesheet 연결 방법
[설명 잘되있는 블로그 보러가기](https://marindie.github.io/spring/Spring-Include-Resource-KR/#toc3)