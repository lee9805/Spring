<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<style>
	form.join-form {
		width: 60%;
		margin: 20px auto;	
	}
	form.join-form fieldset {
		border:  1px solid black;
		border-radius: 10px;
		}
	form.join-form legend {
		text-align: center;
		color: black;
		font-weight: 500;
	}
	form.join-form input,
	form.join-from button {
		display: inline-block;
		width: 80%;
		margin: 5px auto;
		padding: 8px;
	}
</style>
</head>
<body>
	<form:form>
		<fieldset>
			<legend>회원가입</legend>
			<input name="username" placeholder="USERNAME">
			<input name="password" placeholder="PASSWORD">
			<button>회원가입</button>
		</fieldset>
	</form:form>
</body>
</html>