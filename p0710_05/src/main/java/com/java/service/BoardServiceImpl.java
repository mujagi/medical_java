package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dto.BoardDto;
import com.java.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper bordMapper;
	
	@Override
	public ArrayList<BoardDto> selectList() {
		
		ArrayList<BoardDto> list = bordMapper.selectList();
		
		System.out.println("serviceImpl list : "+ list.size());
		
		return list;
	}

}
