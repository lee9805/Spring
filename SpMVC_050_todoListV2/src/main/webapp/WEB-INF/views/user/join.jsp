<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
</head>
<body>
	<h1>JOIN</h1>
	<form:form>
		<div><input type="username" placeholder="username"></div>
		<div><input type="password" placeholder="password"></div>
		<div><input type="re_password" placeholder="re_password"></div>
		<div><input type="email" placeholder="email"></div>
		<div><input type="realname" placeholder="realname"></div>
		<div><input type="nickname" placeholder="nickname"></div>
		<div><button>저장</button></div>
	</form:form>
</body>
</html>