package com.ssy.test.board.impl;

import java.util.List;
import java.util.Map;

import com.ssy.test.util.Pager;

public interface BoardService {

	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	
	public int setAdd(BoardDTO boardDTO) throws Exception;
	
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	public int setDelete(BoardDTO boardDTO) throws Exception;
	
}
