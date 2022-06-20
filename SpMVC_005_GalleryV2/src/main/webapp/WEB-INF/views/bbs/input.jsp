<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<style>
	form#bbsVO {
		width: 60%;
		margin: 10px auto;
	}
	#bbsVO input {
		width: 90%;
		margin: 5px auto;
		padding: 8px;
	}
</style>
</head>
<body>
<form:form modelAttribute="bbsVO" enctype="multipart/form-data">
	<form:input path="b_date" type="hidden"/>
	<form:input path="b_time" type="hidden"/>
	<form:input path="b_writer" type="hidden"/>
	<form:input path="b_subject" />
	<form:input path="b_content" />
	<form:input path="up_file" type="file" />
	<button>저장</button>
</form:form>
<%/* 
	file imput box 에 선택하는 파일 제한하기
	accept=".hwp" : 확장자가 hwp인 파일만 선택할수 있게
	accept=".jpg", accept=".png", accept="gif" : 이미지 파일등중에서
		jpg, png, gif 확장자를 갖는 파일만
	accept="image/*" :모든 이미지 파일
	accept="video/*" :모든 비디오 파일
	accept="audio/*" :모든 음성(음악)파일
	accept="image/*,video/*, audio/*" :이미지, 동영상, 음성파일
*/%>
</body>
</html>