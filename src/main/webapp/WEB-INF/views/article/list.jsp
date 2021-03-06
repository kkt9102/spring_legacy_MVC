<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jstl core -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<%@ include file="../include/header.jsp"%>

<c:set var="title" value="게시물 리스트" />

<section id="body">
	<div class="page_title">${title}</div>

	<a href="write" class="btn">새 글쓰기</a>
	<ul class="article_list mar_top_30">
		<c:forEach items="${article}" var="article">
			<li><a href="detail?id=${article.id}" style="display: block;">
					<c:out value="${article.title}" />
			</a></li>
			<hr>
		</c:forEach>
	</ul>
</section>
