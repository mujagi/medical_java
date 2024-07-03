<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String chk = null;
	String cookName = "";
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("remember")){
				chk = "checked";
				cookName = cookie.getValue();
				System.out.println("cookid : " + cookName);
			}
		}
	}
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키</title>
	</head>
	<body>
	<!-- 쿠키 -->
	<!-- co.jsp  doco.jsp
		이름,국어,영어,수학, 체크박스 : 이름저장 -> 이름,국어,영어,수학,합계,평균
		체크박스,전송버튼           입력창 버튼을 클릭하면 이동
 		이름은 자동으로 입력되도록 하시오.
	 -->
	 <h2>학생성적</h2>
	 <form action = "doco.jsp" method = "post">
	 	<label>이름</label>
	 	<input type = "text" name = "name" value = <%= cookName %>><br>
	 	<label>국어</label>
	 	<input type = "text" name = "kor"><br>
	 	<label>영어</label>
	 	<input type = "text" name = "eng"><br>
	 	<label>수학</label>
	 	<input type = "text" name = "math"><br>
	 	<input type = "checkbox" name = "remember" id = "remember" value = "remember" <%= chk %>>
	 	<br>
	 	<input type = "submit" value = "전송">
	 </form>
	</body>
</html>