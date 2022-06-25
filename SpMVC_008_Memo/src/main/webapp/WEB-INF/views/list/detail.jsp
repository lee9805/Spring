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
	* {
		padding: 0;
		margin: 0;
	}
	body {
		width: 100vw;
		height: 100vh;
	}
	h1 {
		height: 80px;
		line-height: 80px;
		background-color: #b586fc;
		color: #fff;
		text-align: center;
	}
	section.main {
		width: 70%;
		margin: 10px auto;
		border: 1px solid #b586fc;
		background-color: #f6f7c8;
	}
	section.main div {
		text-align: center;
		margin: 10px;
		width:200px;
	}
</style>
</head>
<body>
<h1>자세히 보기</h1>
<section class="main">
	<h2>작성자 : ${MEMO.m_author}</h2>
	<h2>작성일자 : ${MEMO.m_date}</h2>
	<h2>작성시각 : ${MEMO.m_time}</h2>
	<h2>내용 : ${MEMO.m_memo}</h2>
	<div>
	<img src="${rootPath}/upload/${MEMO.m_image}" alt="${MEMO.m_image}">
	</div>
	<br>
	<button onclick="location.href='${rootPath}/list/update?id=${MEMO.m_seq}';">수정하기</button>
	<button onclick="location.href='${rootPath}/list/delete?id=${MEMO.m_seq}';">삭제하기</button>
	<a href="${rootPath}/"}><button>홈으로 ㄱㄱ</button></a>
</section>
</body>
</html>