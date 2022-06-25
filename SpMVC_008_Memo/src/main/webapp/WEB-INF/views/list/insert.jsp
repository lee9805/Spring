<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<style>
	* {
		margin: 0;
		padding: 0;
	}
	section.main {
		width: 70%;
		margin: 10px auto;
		border: 1px solid #b586fc;
		background-color: #f6f7c8;
	}
	h1 {
		height: 80px;
		line-height: 80px;
		background-color: #b586fc;
		color: #fff;
		text-align: center;
	}
	form#memoVO input{
		width: 50%;
		margin: 10px;
	}
	textarea {
		width: 100%;
		height: 50px;
		resize: none;
	}
	button {
		margin: 10px;
		float: right;
		font-size: 1rem;
	}
</style>
</head>
<body>
<section class="main">
<h1>추가하기</h1>
<form:form modelAttribute="memoVO" enctype="multipart/form-data">
	<form:input path="m_seq" type="hidden"/>
	<form:input path="m_author" placeholder="작성자"/>
	<form:input path="m_date" type="hidden"/>
	<form:input path="m_time" type="hidden"/>
	<form:textarea path="m_memo" placeholder="내용"/>
	<input type="file" name="up_file" />
	<button>저장</button>
</form:form>
</section>
</body>
</html>