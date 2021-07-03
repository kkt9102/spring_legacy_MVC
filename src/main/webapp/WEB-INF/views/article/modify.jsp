<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl core -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<c:set var="title" value="글 수정" />

<section id="body">
	<div>${title}</div>
	
	<div class="write_form_box">
		<form action="/article/doModify" method="post" id="modify_form">
		<!-- 해당 게시글의 고유 id정보를 가저온다 -->
<%-- 			<input type="hidden" value="${detail.id}"/> --%>
			<input type="hidden" name="id" value="${detail.id}" />
			<div class="title_input">
				<input type="text" name="title" value="${detail.title}" />
			</div>
			<div class="body_input">
				<textarea name="body" id="" cols="30" rows="10" ><c:out value="${detail.body}" /></textarea>
			</div>

		</form>
		<div class='btn_box'>
			<a href="javascript:void(0);" id="modify_btn" class="btn_2">글수정</a>
			<a href="detail?id=${param.id}" id="cencle_btn" class="btn_2">취소</a>
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
</script>
<%@ include file="../include/footer.jsp" %>