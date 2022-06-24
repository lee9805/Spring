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
</head>
<body>
	<h2>작성자 : ${MEMO.m_author}</h2>
	<h2>작성일자 : ${MEMO.m_date}</h2>
	<h2>작성시각 : ${MEMO.m_time}</h2>
	<h2>제목 : ${MEMO.m_memo}</h2>
	<img src="${rootPath}/upload/${MEMO.m_image}" width="100px"
		alt="${MEMO.m_image}">
	<button onclick="location.href='${rootPath}/list/update?id=${MEMO.m_seq}';">수정하기</button>
	<button onclick="location.href='${rootPath}/list/delete?id=${MEMO.m_seq}';">삭제하기</button>
	
</body>
</html>