<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<script>
	const rootPath = "${rootPath}"
</script>
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
	header {
		background-color: #b586fc;
		color: #fff;
		height: 100px;
		text-align: center;
		line-height: 100px;
	}
	.memo_content{
		width: 20%;
		background-color: #f6f7c8;
		float: left;
		margin: 10px;
		overflow: hidden;
	}
	.memo_content .image {
		text-align: center;
	} 
	.btn_box {
		border: 1px solid green;
		text-align: center;
		font-size: 1.5rem;;
		font-style: none;
		margin-top: 10px;
	}
	.btn_box a {
	 text-decoration: none;
	}

</style>
</head>
<body>
<header>
	<h1>memojang</h1>
</header>
	<div class="btn_box">
		<a href="${rootPath}/list/insert">추가하기</a>
	</div>
	<section class="memo">
	<c:forEach items="${MEMOS}" var="MEMO">
		<div class="memo_content" data-id="${MEMO.m_seq}">
			<p>작성자 : ${MEMO.m_author}
			<p>작성 날짜 :${MEMO.m_date}
			<p>작성 시각 : ${MEMO.m_time}
			<p>내용 : ${MEMO.m_memo}
			<div class="image">
			<img src="${rootPath}/upload/${MEMO.m_image}" width="150px" alt="${MEMO.m_image}">
			</div>
		</div>
	</c:forEach>
	</section>
</body>
<script src="${rootPath}/static/js/detail.js?20220624001"></script>
</html>