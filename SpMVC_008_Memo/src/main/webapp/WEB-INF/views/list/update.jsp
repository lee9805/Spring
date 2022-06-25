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

h1 {
	height: 80px;
	line-height: 80px;
	background-color: #b586fc;
	color: #fff;
	text-align: center;
}

section.main {
	width: 70%;
	margin: 10px auto;
	border: 1px solid #b586fc;
	background-color: #f6f7c8;
}

form#memoVO input {
	width: 50%;
	margin: 10px;
}

textarea {
	width: 100%;
	height: 50px;
	resize: none;
}

button {
	margin: 10px;
	float: right;
	font-size: 1rem;
}
</style>
</head>
<body>
	<h1>수정하기</h1>
	<section class="main">
		<form:form modelAttribute="memoVO" enctype="multipart/form-data">
			<form:input path="m_author" placeholder="m_author" />
			<form:textarea path="m_memo" placeholder="m_memo"></form:textarea>
			<input type="file" name="up_file" accept="image/*" />
			<button>저장하기</button>
		</form:form>
	</section>
</body>
</html>