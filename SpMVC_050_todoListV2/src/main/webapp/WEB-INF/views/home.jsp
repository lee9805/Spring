<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
</head>
<body>
	<h1>하하호호</h1>
	<sec:authorize access="isAnonymous()">
		<h3><a href="${rootPath}/user/login">로그인</a></h3>
		<h3><a href="${rootPath}/user/join">회원가입</a></h3>
	</sec:authorize>

	<sec:authorize access="isAuthenticated() AND hasRole('ROLE_ADMIN')">
		<h3><a href="${rootPath}/admin/home">관리자 페이지</a></h3>
	</sec:authorize>

	<sec:authorize access="isAuthenticated() AND hasRole('ROLE_USER')">
		<h3><a href="${rootPath}/user/mypage">마이페이지</a></h3>
		<h3>
			<form:form action="${rootPath}/logout">
				<button>로그아웃</button>
			</form:form>
		</h3>
	</sec:authorize>
		<div id="map" style="width:500px;height:400px;"></div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c40dd76a6df03f9c54aa753cc3dbc76c"></script>
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(33.450701, 126.570667),
			level: 3
		};

		var map = new kakao.maps.Map(container, options);
	</script>
</body>
</html>