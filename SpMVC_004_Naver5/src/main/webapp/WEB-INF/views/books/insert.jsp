<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<form method="POST" class="w3-container">
	<div>
		<input class="w3-input" name="isbn" id="isbn" placeholder="ISBN" value="${BOOK.isbn}"
			<c:if test="${not empty BOOK.isbn}">
			readonly="readonly"
			</c:if>
		> 
		<input class="w3-input" name="title" id="title" placeholder="도서명 입력후 Enter" value="${BOOK.title}">
	</div>
	<div>
		<input class="w3-input" name="author" placeholder="저자" value="${BOOK.author}"> 
		<input class="w3-input" name="publisher" placeholder="출판사" value="${BOOK.publisher}"> 
		<input class="w3-input" name="pubdate" placeholder="출판일" value="${BOOK.pubdate}">
		<input class="w3-input" name="price" placeholder="가격" type="number" value="${BOOK.price}">
	</div>
	<div>
		<input class="w3-input" name="link" placeholder="자세히 보기" value="${BOOK.link}"> 
		<input class="w3-input" name="image" placeholder="이미지 경로" value="${BOOK.image}">
	</div>
	<textarea class="w3-input" rows="10" name="description">${BOOK.description}"</textarea>
	<button type="button" class="w3-button w3-indigo book-save">저장</button>
</form>
