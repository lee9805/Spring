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
@import "compass/css3";

$
color: rgb(255, 215, 7) ;
 $colorDark: darken( $color, 10 %) transparent ;

* {
	box-sizing: bordel-box;
	margin: 0;
	padding: 0;
}

html {
	width: 100vw;
	height: 100vh
}

body {
	width: 100%;
	height: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	background: rgb(50, 50, 50);
	color: white;
}

form {
	width: 50%;
	text-align: center;
}

input {
	padding: 1rem;
	width: 100%;
}
</style>
</head>
<body>
	<form method="POST" enctype="multipart/form-data">
		<input name="m_seq" type="hidden"
			value='<c:out value="${MEMO.m_seq}" default="0"/>'> <input
			name="m_memo" placeholder="메모를 입력하세요" value="${MEMO.m_memo}">
		<input name="file" type="file" accept="images/*">
		<button>메모 기록</button>
	</form>
</body>
</html>