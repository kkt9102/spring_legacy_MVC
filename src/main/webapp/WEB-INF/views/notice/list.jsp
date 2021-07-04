<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jstl core -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<%@ include file="../include/header.jsp"%>

<c:set var="title" value="공지사항" />

<section id="body">
	<div class="page_title">${title}</div>

	<a href="write" class="btn">새 글쓰기</a>
	<ul class="article_list mar_top_30">
		<c:forEach items="${notice}" var="notice">
			<li><a href="detail?id=${notice.id}" style="display: block;">
					<c:out value="${notice.title}" />
			</a></li>
			<hr>
		</c:forEach>
	</ul>
</section>
