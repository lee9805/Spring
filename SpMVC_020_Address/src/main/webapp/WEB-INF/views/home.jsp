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
<title>Insert title here</title>
<style>
* {
	background-color: black;
	color: white;
	margin: 0;
	padding: 0;
}

form {
	border: 1px solid #d66fd3;
	background-color: #d66fd3;
	height: 100px;
	text-align: center;
}

form input {
	background-color: white;
	color: black;
	border: none;
}
</style>
</head>
<body>
	<h1>하하호호</h1>
	<form method="POST">
	<input name="a_seq">
		<input name="a_name" placeholder="name"> 
		<input name="a_tel" placeholder="tel"> 
			<input name="a_address" placeholder="address">
		<button>저장</button>
	</form>
		<table>
			<tr>
				<th>이름</th>
				<th>전화번호</th>
				<th>주소</th>
			</tr>
			<c:forEach items="${ADDRS}" var="ADDR">
			<tr>
			
				<td><a href="${rootPath}/detail?seq=${ADDR.a_seq}">${ADDR.a_name}</a></td>
				<td>${ADDR.a_tel}</td>
				<td>${ADDR.a_address}</td>
			</tr>
			</c:forEach>
		</table>

</body>
</html>