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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"/>
<title>Insert title here</title>
</head>
<body>
	<h1>학생 리스트</h1>
	<table class="w3-table-all">
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>학년</th>
			<th>전화번호</th>
			<th>주소</th>
		</tr>
		<c:forEach items="${STUDENTS}" var="STUDENT">
			<tr>
				<td>${STUDENT.st_num}</td>
				<td>${STUDENT.st_name}</td>
				<td>${STUDENT.st_dept}</td>
				<td>${STUDENT.st_grade}</td>
				<td>${STUDENT.st_tel}</td>
				<td>${STUDENT.st_addr}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>