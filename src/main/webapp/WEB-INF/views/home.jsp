<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!-- <html> -->
<!-- <head> -->
<!-- 	<title>Home</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- <h1> -->
<!-- 	Hello world!   -->
<!-- </h1> -->
<%@ include file="include/header.jsp" %>

<c:set var="title" value="메인페이지" />

<!-- ver_1 -->
<%-- <c:out value="${title}" /> --%>
<!-- ver_2 -->
<div>${title}</div>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
