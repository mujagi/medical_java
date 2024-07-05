package com.java.www;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.service.BoardDeleteService;
import com.java.www.service.BoardDoModifyService;
import com.java.www.service.BoardListService;
import com.java.www.service.BoardModifyService;
import com.java.www.service.BoardReadService;
import com.java.www.service.BoardService;
import com.java.www.service.BoardWriteService;
import com.java.www.service.MemberLoginService;
import com.java.www.service.MemberService;


@WebServlet("*.do")
public class FrontControllor extends HttpServlet {
	

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		String url = null;
		String uri = request.getRequestURI(); //
		String contextPath = request.getContextPath();
		String fileName = uri.substring(contextPath.length());
		System.out.println("클릭된 파일이름 : "+ fileName);
		BoardService boardService = null;
		request.setCharacterEncoding("utf-8");
		MemberLoginService memberService = null;
		
		if(fileName.equals("/index.do")) {
			url = "index.jsp";
		}else if(fileName.equals("/login.do")){
			url = "login.jsp";
		}else if(fileName.equals("/doLogin.do")){
			memberService = new MemberLoginService();
			memberService.execute(request, response);
			response.sendRedirect("index.do");
		}else if(fileName.equals("/join01_terms.do")) {
			url = "join01_terms.jsp";
		}
		else if(fileName.equals("/write.do")){
			url = "write.jsp";
		}else if(fileName.equals("/dowrite.do")){
			//btitle,bcontent 넘어옴
			boardService = new BoardWriteService();
			boardService.execute(request, response);
			response.sendRedirect("list.do");
		}else if(fileName.equals("/read.do")){
			//btitle,bcontent 넘어옴
			boardService = new BoardReadService();
			boardService.execute(request, response);
			url = "read.jsp";
		}else if(fileName.equals("/modify.do")){
			//btitle,bcontent 넘어옴
			boardService = new BoardModifyService();
			boardService.execute(request, response);
			url = "modify.jsp";
		}else if(fileName.equals("/doModify.do")){
			//btitle,bcontent 넘어옴
			boardService = new BoardDoModifyService();
			boardService.execute(request, response);
			response.sendRedirect("list.do");
		}else if(fileName.equals("/delete.do")){
			//btitle,bcontent 넘어옴
			boardService = new BoardDeleteService();
			boardService.execute(request, response);
			url = "delete.jsp";
		}else if(fileName.equals("/list.do")) {
			// 부모의 참조변수 = 자손의 객체를 다루는 것
			boardService = new BoardListService(); //객체선언
			boardService.execute(request, response);
			url = "list.jsp";
		}
		if(url != null) {			
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
