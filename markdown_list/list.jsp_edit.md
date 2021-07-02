## 변경 전 코드
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

## 변경 후 코드
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
	 	<!-- ${article.id}를 이용하여 클릭한 게시물에 해당하는 id값을 넣어준다 -->
			<a href="detail?id=${article.id}">
				<c:out value="${article.title}"/>
			</a>
		</c:forEach>
	</section>
		
```