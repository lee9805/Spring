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
<link rel="stylesheet" href="${rootPath}/static/css/home.css?ver=2022-06-03">
<title>Insert title here</title>
</head>
<body>
<header>
	<h1>Naver OpenAPI</h1>
</header>
<section>
	<nav>
		<ul>
			<li>홈</li>
			<a href="${rootPath}/book/list">
			<li>도서정보</li>
			</a>
			<li>오늘의 뉴스</li>
			<li>영화정보</li>
			<li>로그인</li>
			<li>회원가입</li>
		</ul>
	</nav>

</section>

</body>
</html>