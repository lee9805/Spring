<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="com.callor.school.domain.StudentVO" %>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp" %>
<style>
	section {
		display: flex;
		flex-direction: column;
	}
	article {
		width: 80%;
		margin: 0 auto;
	}
	table {
		width: 90%;
		margin: 0 auto;
		border-top: 2px solid rgb(175, 209, 171);
		border-bottom: 1px solid rgb(175, 209, 171);
		border-collapse: collapse;
	}
	tr{
		border-bottom: 1px solid rgb(175, 209, 171);
		border-top: 1px solid rgb(175, 209, 171);
	}
	th, td {
		padding: 5px;
		text-align: left;
		cursor: pointer;
	}
	tr:nth-of-type(even) {
		background-color: #eee;
	}
	tr:nth-of-type(n+2):hover {
		background-color: black;
		color: white;
	}
	th {
		background-color: rgb(175, 209, 171);
	}
	div.botton-box {
		width: 90%;
		margin: 5px auto;
		text-align: right;
		padding: 5px 0;
	}
	div.botton-box a {
		display: inline-block;
		padding: 12px 16px;
		text-decoration: none;
		color: white;
		background-color: rgb(52,152,219);
		border-radius: 5px;
	}
	div.botton-box a:hover {
		box-shadow: 2px 2px 2px rgba(0,0,0,0.6);
	}
</style>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp" %>
	<%@ include file="/WEB-INF/views/include/include_nav.jsp" %>
	<section>
		<article>학생정보</article>
		<table>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>학과</th>
				<th>학년</th>
				<th>주소</th>
			</tr>
			<%
			List<StudentVO> stList = (List<StudentVO>)request.getAttribute("STUDENTS");
			for(int i = 0; i<5; i++) {
			%>
			<tr>
				<td>
				<%= stList.get(i).getStNum()%>
				</td>
				<td>${STUDENTS[0].stName}</td>
				<td>${STUDENTS[0].stDept}</td>
				<td>${STUDENTS[0].intGrade}</td>
				<td>${STUDENTS[0].stAddr}</td>
			</tr>
			<%
			}
			%>
		</table>
			<div class="botton-box">
			<a href="${pageContext.request.contextPath}/student/insert">학생정보 등록</a>
			</div>
	</section>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp" %>
		<!-- <article><button>학생정보 추가</button></article> -->
</body>
</html>