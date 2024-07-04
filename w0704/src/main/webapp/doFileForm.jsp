<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>파일 업로드</title>
	</head>
	<body>
		<%
			//String uploadPath = request.getRealPath("C:/Users/KOREAVC/Downloads");
			String uploadPath = "C:/upload";
			int size = 10*1024*1024; // 10mb
			
			//String id = request.getParameter("id");
			
			MultipartRequest multi = new MultipartRequest(request,uploadPath,size,"utf-8",new DefaultFileRenamePolicy());
			String id = multi.getParameter("id");
			
			/* 여러 파일 이름 가져오기 */
			Enumeration files = multi.getFileNames();
			String file = (String)files.nextElement(); // name = profile (fileform - input 파일업로드 name)
			String fileName = multi.getFilesystemName(file);
			
			out.println("아이디 : "+id+"<br>");
			out.println("파일명 : "+fileName+"<br>");
		
		%>
	</body>
</html>