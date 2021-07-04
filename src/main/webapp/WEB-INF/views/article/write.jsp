<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl core -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<c:set var="title" value="새 글쓰기" />

<section id="body">
	<div class="page_title">${title}</div>
	
	<div class="write_form_box">
		<form action="/article/doWrite" method="post" id="write_form">
			<div class="title_input">
				<input type="text" name="title" placeholder="제목을 입력해주세요."/>
			</div>
			<div class="body_input">
				<textarea name="body" id="" cols="30" rows="10" placeholder="내용을 입력해주세요."></textarea>
			</div>
			<div>
				<input type="hidden" name="writer" placeholder="임시" value="작성자(임시)"/>
			</div>
		</form>
		<div class='btn_box'>
			<a href="javascript:void(0);" id="write_btn" class="btn">글쓰기</a>
			<a href="list" id="cencle_btn" class="btn">취소</a>
		</div>
	</div>
</section>
<script>
// 게시글 등록 action
	$('#write_btn').click(function(e){
		
		var form = $('#write_form');
		form.attr("method","post");
		form.submit();
	})


	
	
	
</script>
<%@ include file="../include/footer.jsp" %>