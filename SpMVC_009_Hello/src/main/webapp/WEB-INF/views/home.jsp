<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
core tag 라이브리, c tag 라이브러리 
JSP 파일에서 Controller 부터 전달받은 데이터를 취급하기 위하여
사용하는 확장 tag 라이브러리
forEach, if, choose, set
*/
%>
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
<h1>하하호호 신난다 ㅎㅎㅎ 스타벅스 캐리백 받으러 가야지 ㄶㅎㅎ</h1>
<h2>${NATION}</h2>
<form method="POST" action="${rootPath}/">
	<input name="nation" placeholder="집"/>
	<input name="age" placeholder="나이"/>
	<button>ㄱㄱ</button>

</form>
</body>
</html>