<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
 	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta charset="UTF-8">
	<title>로그인 체크</title>
	<script>
		if("<%=id%>" == "aaa" && "<%=pw%>" == "1111"){
			alert("로그인 성공")
			location.href = "Index.jsp";
			<%
				session.setAttribute("sessionId", id);
			
			%>
		}else{
			alert("아이디 또는 패스워드가 일치하지 않습니다.")
			location.href = "login.jsp"
		}
	</script>
	
	</head>
	<body>
		<%--
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			if(id.equals("aaa") && pw.equals("1111")){
				response.sendRedirect("Index.jsp");
			}else{
				response.sendRedirect("login.jsp");
			}
		--%>
	</body>
</html>