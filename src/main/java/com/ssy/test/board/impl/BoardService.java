package com.ssy.test.board.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.web.multipart.MultipartFile;

import com.ssy.test.util.Pager;

public interface BoardService {
	
	//파일 삭제
	public int setFileDelete(BoardFileDTO boardFileDTO, ServletContext servletContext)throws Exception;

	//글 목록
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	//글 조회
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	
	//글 쓰기
	public int setAdd(BoardDTO boardDTO, MultipartFile [] files, ServletContext servletContext) throws Exception;
	
	//글 수정
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	//글 삭제
	public int setDelete(BoardDTO boardDTO) throws Exception;
	
}
