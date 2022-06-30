<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>소정이의 메모장>_ㅇ(찡긋)</title>
<style>
@import "compass/css3";

$color: rgb(255,215,7);
$colorDark: darken($color, 10%) transparent;

* {
	margin: 0;
	padding: 0;
}

html {
	width: 100vw;
	height: 100vh;
}
header {
	WIDTH: 100%;
    HEIGHT: 30%;
    MARGIN: 20PX;
    TEXT-ALIGN: CENTER;
    FONT-SIZE: 30PX;
}
header a{
	border: 1px solid;
	text-decoration: none;
	background-color: black;
	color: white;
	padding: 0.6rem;
	FONT-SIZE: 15PX;
}
header a:hover {
	background-color: skyblue;
	color: white;
}
body {
  background: rgb(50,50,50);
	color: white;
}

tr {
  width: 20%;
  min-width: 13em;
  margin: 1em auto;
}
th{
  border: 1px solid white;
}
td {
  font-family: helvetica;
  font-size: 1.5em;
  font-weight: bold;
}

.memo {
   padding: 2em;
   background: $color;
   position: relative;
   min-height: 10em;
   justify-content: center;
   margin-left:auto; 
   margin-right:auto;
}
.memo:after {
   content: "";
   position: absolute;
   bottom: -2em;
   left: 0;
   right: 2em;
   border-width: 1em;
   border-style: solid;
   border-color: $color;
}
.memo:before {
   content: "";
   position: absolute;
   bottom: -2em;
   right: 0;
   border-width: 2em 2em 0 0;
   border-style: solid;
   border-color: $colorDark;
}
</style>
<script>
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/memo.js?202206027004"></script>
</head>
<body>
	<header>
		<c:if test="${not empty USERNAME}">
			<h1>${USERNAME}님반가워요</h1>
			<a href="${rootPath}/user/logout">로그아웃 하기</a>
		</c:if>
		<c:if test="${empty USERNAME}">
			<a href="${rootPath}/user/login">로그인 하기</a>
		</c:if>
		<a href="${rootPath}/memo/insert">메모장 작성하기</a>
	</header>
	<table class="memo">
		<tr>
			<th>seq</th>
			<th>작성일자</th>
			<th>작성 시각</th>
			<th>메모</th>
			<th>이미지</th>
		</tr>
		<c:if test="${empty MEMOS}">
			<tr>
				<td colspan="5">메모가 없습니다</td>
			</tr>
		</c:if>
		<c:forEach items="${MEMOS}" var="MEMO" varStatus="INDEX">
			<tr data-seq="${MEMO.m_seq}">
				<td>${INDEX.count}</td>
				<td>${MEMO.m_date}</td>
				<td>${MEMO.m_time}</td>
				<td>${MEMO.m_memo}</td>
				<td><img src="${rootPath}/upload/${MEMO.m_up_image}"
				alt="${MEMO.m_image}" width="200px"></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>