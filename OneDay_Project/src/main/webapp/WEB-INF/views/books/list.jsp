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
</head>
<body>
<%@ include file="/WEB-INF/views/home.jsp" %>
	<form method="POST">
		<div class="first">
			<input name="isbn" id="isbn" placeholder="ISBN"> <input
				name="title" id="title" placeholder="도서명 입력후 Enter">
		</div>
		<div class="second">
			<input name="author" placeholder="저자"> <input
				name="publisher" placeholder="출판사"> <input name="pubdate"
				placeholder="출판일"> <input name="price" placeholder="가격"
				type=" number">
		</div>
		<textarea rows="10"></textarea>
		<button type="submit">저장</button>
		<button type="reset">새로 작성하기</button>
		<button type="submit">리스트보기</button>
	</form>

</body>
</html>