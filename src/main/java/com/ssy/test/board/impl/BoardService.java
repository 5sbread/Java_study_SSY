package com.ssy.test.board.impl;

import java.util.List;

public interface BoardService {

	public List<BoardDTO> getLsit()throws Exception;
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	
	public int setAdd(BoardDTO boardDTO) throws Exception;
	
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	public int setDelete(BoardDTO boardDTO) throws Exception;
	
}
