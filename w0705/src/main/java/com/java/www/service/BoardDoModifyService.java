package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BoardDoModifyService implements BoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao boardDao = new BoardDao();
		int bno = Integer.parseInt(request.getParameter("bno")) ;
		String bfile = request.getParameter("bfile");
		String bcontent =  request.getParameter("bcontent");
		String btitle = request.getParameter("btitle");
		
		System.out.println("boardWriteService btitle : " + btitle);
		System.out.println("boardWriteService bcontent : " + bcontent);
		
		boardDao.update(bno,btitle,bcontent,bfile);
//		boardDao.update(new Board(bno,btitle,bcontent,bfile));

	}

}
