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
		<a href="modify?id=${param.id}" class="btn">수정</a>
		<a href="list" class="btn">목록으로</a>
	</div>
	
</section>
