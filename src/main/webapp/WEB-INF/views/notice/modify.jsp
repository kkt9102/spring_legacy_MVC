<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl core -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<c:set var="title" value="글 수정" />

<section id="body">
	<div class="page_title">${title}</div>
	
	<div class="modify_form_box">
		<form action="/notice/doModify" method="post" id="modify_form">
			<!-- 해당 게시글의 고유 id정보를 가저온다 -->
			<input type="hidden" name="id" value="${detail.id}" />
			<div class="title_input">
				<input type="text" name="title" value="${detail.title}" />
			</div>
			<div class="body_input">
				<textarea name="contents" id="" cols="30" rows="10" ><c:out value="${detail.contents}" /></textarea>
			</div>
		</form>
		
		<!-- 게시글 삭제 form -->
		<form action="/article/doDelete" method="post" id="delete_form">
			<input type="hidden" name="id" value="${detail.id} "/>
		</form>
		<div class='btn_box'>
			<a href="javascript:void(0);" id="modify_btn" class="btn">글수정</a>
			<a href="detail?id=${param.id}" id="cencle_btn" class="btn">취소</a>
			<a href="javascript:void(0);" id="delete_btn" class="btn">삭제하기</a>
		</div>
	</div>
</section>
<script>
// 게시글 등록 action
	$('#modify_btn').click(function(e){
		
		var form = $('#modify_form');
		form.attr("method","post");
		form.submit();
	})

// 게시글 삭제 action
	$('#delete_btn').click(function(e){
		
		var form = $('#delete_form');
		form.attr("method","post");
		form.submit();
	})
</script>
<%@ include file="../include/footer.jsp" %>