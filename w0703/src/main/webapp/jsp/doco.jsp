
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	int kor = Integer.parseInt(request.getParameter("kor")) ;
	int eng = Integer.parseInt(request.getParameter("eng")) ;
	int math = Integer.parseInt(request.getParameter("math")) ;
	int total = kor+eng+math;
	double avg = total/3.0;
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적정보</title>
		<style>
			table,th,td{border : 1px solid black; border-collapse: collapse; }
			th{width : 120px;}
		</style>
	</head>
	<body>
		<h2>학생성적정보</h2>
		<table>
			<tr>
				<th>제목</th>			
				<th>내용</th>			
				
			</tr>
			<tr>
				<td>이름</td>
				<td><%= request.getParameter("name") %></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><%= kor %></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><%= eng %></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><%= math %></td>
			</tr>
			<tr>
				<td>합계</td>
				<td><%= total %></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><%= avg %></td>
			</tr>
			
		<%
			String remember = request.getParameter("remember");
			if(remember != null){
				Cookie rcookie = new Cookie("remember",request.getParameter("name"));
				rcookie.setMaxAge(60*60*24*30);
				response.addCookie(rcookie);
			}
		%>
		<a href = "co.jsp">학생성적입력으로 이동</a>
		</table>
	</body>
</html>