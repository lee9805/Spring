<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<form method="POST" enctype="multipart/form-data">
	<div class="student detail_body">
		<div>학번 :</div>
		<div class="student detail">${STUDENT.st_num}</div>
	</div>
	<div class="student detail_body">
		<div>이름 :</div>
		<input name="st_name" class="student detail"
			placeholder="이름" value="${STUDENT.st_name}">
	</div>
	<div class="student detail_body">
		<div>학년 :</div>
		<input name="st_dept" class="student detail"
			placeholder="학년" value="${STUDENT.st_dept}">
	</div>
	<div class="student detail_body">
		<div>전화번호 :</div>
		<input name="st_tel" class="student detail"
			placeholder="전화번호" value="${STUDENT.st_tel}">
	</div>
	<div class="student detail_body">
		<div>주소 :</div>
		<input name="st_addr"class="student detail"
			placeholder="전화번호"value="${STUDENT.st_addr}">
	</div>
	<div>
		<c:forEach items="${STUDENT.scoreList}" var="SCORE">
			<div>${SCORE.sb_name}(${SCORE.sc_sbcode}) : ${SCORE.sc_score}</div>
		</c:forEach>
		<button>저장</button>
	</div>
</form>