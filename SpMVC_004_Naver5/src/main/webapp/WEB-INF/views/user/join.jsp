<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	form.join {
		width: 70%;
		margin: 20px auto;
		padding: 20px;
	}
	form.join input, form.join button {
		margin: 5px;
	}
</style>
<script src="${rootPath}/static/js/join.js?ver=2022-06-09-007"></script>
</head>
<body>
<form method="POST" class="w3-container w3-card-4 join">
	
	<h2>회원가입</h2>
	
	<label class="w3-text-blue">user Name(id)</label>
	<input name="username" placeholder="USERNAME" class="w3-input w3-border" id="username">
	
	<label class="w3-text-blue">비밀번호</label>
	<input name="password" placeholder="PASSWORD" class="w3-input w3-border" id="password">
	
	<label class="w3-text-blue">비밀번화 확인</label>
	<input name="re_password" placeholder="RE_PASSWORD" class="w3-input w3-border" id="re_password">
	
	<label class="w3-text-blue">email</label>
	<input name="email" placeholder="EMAIL" class="w3-input w3-border" id="email">
	
	<label class="w3-text-blue">이름</label>
	<input name="name" placeholder="NAME" class="w3-input w3-border" id="name">
	
	<label class="w3-text-blue">닉네임</label>
	<input class="w3-input w3-border" name="nickname" placeholder="NICKNAME" id="nickname">
	
	<button id="btn-join" class="w3-button w3-blue" type="button">회원가입</button>
</form>
</body>
</html>