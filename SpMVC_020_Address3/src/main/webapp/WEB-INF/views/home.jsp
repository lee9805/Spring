<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>주소록 찡긋</title>
<script>
	const rootPath = '${rootPath}'
</script>
<script src="${rootPath}/static/js/addr.js?ver=20220720004"></script>
<style>
	* {
		box-sizing: border-box;
		margin: 0;
		padding: 0;
	}
	html {
		width: 100vw;
		height: 100hw;
	}
	body {
		width: 100%;
		height: 100%;
		display: flex;
		flex-direction: column;
	}
	header {
		background-color: black;
		color: white;
		text-align: center;
	}
	header h1 {
		font-weight: 900;
		text-shadow: 1px 1px 1px gray;
		height: 20vh;
	}
	nav ul{
		display: flex;
		list-style: none;
		background-color: gray;
		color: white;
	}
	nav li {
		padding: 12px 16px;
		margin: 0.5rem;
	}
	nav a {
		color: inherit;
		text-decoration: none;
	}
</style>
</head>
<body>
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="body"/>
	<tiles:insertAttribute name="footer"/>
</body>
</html>