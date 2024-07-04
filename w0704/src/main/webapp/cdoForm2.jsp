<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% request.setCharacterEncoding("utf-8"); 
 	String[] hobby = request.getParameterValues("hobby");
 	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<style>
		table,th,td{border:1px solid black; border-collapse:collapse}
		th{width:120px;}
	</style>
	</head>
	<body>

	<h2>로그인 정보</h2>
	<table>
		<tr>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%= request.getParameter("id") %></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%= request.getParameter("pw") %></td>
		</tr>
		<%
			String remember = request.getParameter("remember");
			//String[] remember = request.getParameterValues("remember");
			if(remember != null){
				Cookie rcookie = new Cookie("remember",request.getParameter("id"));
				rcookie.setMaxAge(60*60*24*30); // 60s * 60m * 24h * 30d 
				response.addCookie(rcookie); 
			}
		
		%>
		
	</table>
	<a href="cform.jsp">로그인페이지 이동</a> 
	
	</body>
</html>