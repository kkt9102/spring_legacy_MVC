## 게시글 수정으로 이동하기 위한 버튼 추가 구현

```html
	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl core -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page session="false" %>
	
	<%@ include file="../include/header.jsp" %>
	
	<c:set var="title" value="상세페이지" />
	<style>
		.title {font-size:2rem; font-weight:bold; text-align:center;}
		.detail_info {display:flex;}
		.detail_info .writer::after {content:""; width:1px; height:100%; background:#000000;}
	</style>
	<section id="body">
		<div style="display:none;">${title}</div>
		<div class="title"><c:out value="${detail.title}" /></div>
		<div class="detail_info">
			<div class="writer"><span>작성자 : </span><c:out value="${detail.writer}" /></div>&ensp;&ensp;
			<div class="reg_date"><span>생성날짜 : </span><c:out value="${detail.regDate}" /></div>&ensp;&ensp;
			<div class="update_date"><span>수정날짜 : </span><c:out value="${detail.updateDate}" /></div>
		</div>
		<hr>
		<div class="body_content">
			<c:out value="${detail.body}" />
		</div>
		<hr>
		<div class="btn_box">
		<!-- ADD CODE -->
		<!-- 해당 경로를 modify로만 지정해주면 modify로 이동 시 어떤 게시글에 대한 수정 페이지인지 알 수 없으므로 param을 이용하여 현재 게시물의 id값을 가져와서 이동경로에 넣어준다. -->
			<a href="modify?id=${param.id}">수정</a>
		<!-- ADD CODE -->
			<a href="list">뒤로가기</a>
		</div>
	
</section>
	
```