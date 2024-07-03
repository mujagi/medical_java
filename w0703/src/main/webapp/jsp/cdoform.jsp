<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	request.setCharacterEncoding("utf-8");
 	String[] hobby =  request.getParameterValues("hobby");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
<style>
	table,th,td{border : 1px solid black; border-collapse: collapse; }
	th{width : 120px;}
</style>

</head>
<body>

	<h2>로그인</h2>
	<table>
		<tr>
			<td>제목</td>
			<td>내용</td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%= request.getParameter("id")%></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%= request.getParameter("pw") %></td>
		</tr>
	</table>
	<%
		String remember = request.getParameter("remember");
		//String[] remember = request.getParameterValues("remember");
		if(remember != null){
			Cookie rcookie = new Cookie("remember",request.getParameter("id"));
			rcookie.setMaxAge(60*60*24*30);
			response.addCookie(rcookie);
		}
	
	%>
	<a href = "cform.jsp">로그인페이지 이동</a>
</body>
</html>