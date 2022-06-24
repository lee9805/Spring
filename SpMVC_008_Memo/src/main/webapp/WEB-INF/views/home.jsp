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
	.memo_content{
		width: 20%;
		background-color:;
	}
</style>
</head>
<body>
	<h1>memojang</h1>
	<section class="memo">
	<c:forEach items="${MEMOS}" var="MEMO">
		<div class="memo_content" data-id="${MEMO.m_seq}">
			<p>작성자 : ${MEMO.m_author}
			<p>작성 날짜 :${MEMO.m_date}
			<p>작성 시각 : ${MEMO.m_time}
			<p>내용 : ${MEMO.m_memo}
			<img src="${rootPath}/upload/${MEMO.m_image}" width="100px" alt="${MEMO.m_image}">
		</div>
	</c:forEach>
	</section>
	<div class="btn_box">
		<a href="${rootPath}/list/insert">추가하기</a>
	</div>
</body>
<script src="${rootPath}/static/js/detail.js?20220624001"></script>
</html>