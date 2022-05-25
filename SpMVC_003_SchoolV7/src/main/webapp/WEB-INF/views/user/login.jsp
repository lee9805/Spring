<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	from {
		width : 60%;
		margin : 20px auto;
	}
	fieldset {
		border: 2px solid pink;
		display : flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	legend {
		text-align: center;
		padding: 10px
 	}
 	form input, form button {
 		width: 80%;
 		padding: 8px;
 		margin: 5px;
 		
 	}
</style>
</head>
<body>
	<form method="post" autocomplete="off">
		<fieldset>
			<legend>로그인</legend>
			<input name="username" placeholder="USER NAME">
			<input name="password" type ="password" placeholder="PASSWORD">
			<button>로그인</button>
		</fieldset>	
	</form>
</body>
</html>