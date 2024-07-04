<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward</title>
	</head>
	<body>
		<table>
		<tr>
			<td>제목</td>
			<td>내용</td>
		</tr>
		<tr>
			<td>아이디</td>
			<td>${param.id}</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>${param.pw}</td>
		</tr>
	</body>
</html>