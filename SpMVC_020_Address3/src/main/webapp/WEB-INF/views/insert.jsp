<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<script>
	const rootPath = ${rootPath}
</script>
<form method="POST" class="insert">
	<input name="a_seq" type="hidden" value='<c:out value="${ADDR.a_seq}" default="0"/>' />
	<input name="a_name" placeholder="이름" value="${ADDR.a_name}"/>
	<input name="a_tel" placeholder="전화번호"  value="${ADDR.a_tel}"/>
	<input name="a_address" placeholder="주소"  value="${ADDR.a_address}"/>
	<button name="btn_insert">저장</button>
</form>
<script src="${rootPath}/static/js/input.js?ver=20220720007"></script>