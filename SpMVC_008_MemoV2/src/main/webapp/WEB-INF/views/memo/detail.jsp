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
body {
  background: rgb(50,50,50);
	color: white;
}
.insert div {
	font-size: 20px;
}
.insert div a {
	text-decoration: none;
	color: white;
	border: 1px solid white;
	padding: 10px;
}
.button {
	margin-top: 50px;
}
.insert {
   padding: 2em;
   background: $color;
   position: relative;
   min-height: 10em;
   text-align: center;
}
.insert:after {
   content: "";
   position: absolute;
   bottom: -2em;
   left: 0;
   right: 2em;
   border-width: 1em;
   border-style: solid;
   border-color: $color;
}
.insert:before {
   content: "";
   position: absolute;
   bottom: -2em;
   right: 0;
   border-width: 2em 2em 0 0;
   border-style: solid;
   border-color: $colorDark;
}
</style>
</head>
<body>
<div class="insert">
<div>작성자 : ${MEMO.m_author}</div>
<div>작성 날짜 : ${MEMO.m_date}</div>
<div>작성 시각 : ${MEMO.m_time}</div>
<div>메모 : ${MEMO.m_memo}</div>
<div>이미지 : </div>
<img src="${rootPath}/upload/${MEMO.m_up_image}"
				alt="${MEMO.m_image}" width="300px">
<div class="button">
	<a href="${rootPath}/memo/${MEMO.m_seq}/update">수정</a>
	<a href="${rootPath}/memo/${MEMO.m_seq}/delete">삭제</a>
	<a href="${rootPath}/">welcome</a>
</div>
</div>
</body>
</html>