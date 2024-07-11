package com.java.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.BoardDto;
import com.java.service.BoardService;
import com.java.service.BoardServiceImpl;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService; //IOC컨테이너에서 주입받음
	
	@RequestMapping("/list")
	public ModelAndView list() {	
		ArrayList<BoardDto> list = boardService.selectList();
		
		//mv
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",list);
		mv.setViewName("board/list");
		
		return mv;
	}//list
	
	@RequestMapping("/view") //뷰페이지
	public ModelAndView view(BoardDto bdto) {
		
		//1개 
		BoardDto boardDto = boardService.selectOne(bdto);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardDto",boardDto);
		mv.setViewName("board/view");
		return mv;
	}//view
	
	@GetMapping("/write") //글쓰기화면
	public String write() {
		return "board/write";
	}//write
	
	@PostMapping("/write") //글쓰기 저장
	public String write(BoardDto bdto,@RequestPart MultipartFile files) {
		//id,btitle,bcontent,files
		System.out.println("controller files : " + files.getOriginalFilename());
		String uFile = "";
		//파일이 존재할시
		if(!files.isEmpty()) {
			//jsp
			long time = System.currentTimeMillis();
		
//			UUID uuid = UUID.randomUUID();
//			System.out.println("uuid : "+uuid);
		
			System.out.println("time :  " + time);
			uFile = String.format("%d_%s", time,files.getOriginalFilename());
			String saveUrl = "c:/upload/";
			File f = new File(saveUrl+uFile);
			try {
				files.transferTo(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//if
		
		//변경된 파일이름저장
		bdto.setBfile(uFile);
		
		boardService.insertBoard(bdto);
		
		return "redirect:/board/list";
	}//write
	
	@RequestMapping("/delete") //게시글삭제
	public String delete(BoardDto bdto) {
		System.out.println("controller delete bno"+bdto.getBno());
		boardService.deleteBoard(bdto);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping("/update")
	public ModelAndView update(BoardDto bdto) { //게시글 수정
		String uFile = "";
		
		
		
		
		BoardDto boardDto =  boardService.updateBoard(bdto);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardDto",boardDto);
		mv.setViewName("/board/modify");

		return mv;
	}//update
	
	@RequestMapping("/doUpdate")
	public String doUpdate(BoardDto bdto,@RequestPart MultipartFile files) { //게시글 수정 저장
		String uFile = "";
		//파일이 존재할시
				if(!files.isEmpty()) {
					//jsp
					long time = System.currentTimeMillis();
				
//					UUID uuid = UUID.randomUUID();
//					System.out.println("uuid : "+uuid);
				
					System.out.println("time :  " + time);
					uFile = String.format("%d_%s", time,files.getOriginalFilename());
					String saveUrl = "c:/upload/";
					File f = new File(saveUrl+uFile);
					try {
						files.transferTo(f);
					} catch (Exception e) {
						e.printStackTrace();
					}
					bdto.setBfile(uFile);
				}//if
		//수정페이지 저장 bno,id,btitle,bcontent
		boardService.doUpdateBoard(bdto);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping("/reply") //답글페이지
	public ModelAndView reply(BoardDto bdto) {
		
		BoardDto boardDto = boardService.selectOne(bdto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardDto",boardDto);
		mv.setViewName("board/reply");
		
		return mv;
	}//reply
	
	@RequestMapping("/doReply") //답글페이지 저장
	public String doRefly(BoardDto bdto,@RequestPart MultipartFile files) {
		
		String uFile = "";
		//파일이 존재할시
				if(!files.isEmpty()) {
					//jsp
					long time = System.currentTimeMillis();
				
					System.out.println("time :  " + time);
					uFile = String.format("%d_%s", time,files.getOriginalFilename());
					String saveUrl = "c:/upload/";
					File f = new File(saveUrl+uFile);
					try {
						files.transferTo(f);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}//if
				bdto.setBfile(uFile);
				boardService.insertReply(bdto);
		return "redirect:/board/list";
	}//doRefly
	
}//class
