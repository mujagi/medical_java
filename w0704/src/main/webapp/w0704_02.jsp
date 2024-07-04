<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL태그</title>
		<style>
			table,th,td{border:1px solid black; border-collapse:collapse}
			th{width:120px;}
		</style>
	</head>
	<body>
		<% int sum = 0;
		for(int i = 1; i<=10; i++){
			sum += i;
		}
		%>
		<table>
			<tr>
				<td>변수</td>
				<td>값</td>
			</tr>
			<tr>
				<td>변수</td>
				<td>i</td>
			</tr>
			<tr>
				<td>총합</td>
				<td><%=sum %></td>
				<td>${sum}</td>
			</tr>
		</table>
		
	</body>
</html>