package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	//메인페이지
	@RequestMapping("/index")
	public String index() {
		return "index";
	}//메인페이지
	
}//class
