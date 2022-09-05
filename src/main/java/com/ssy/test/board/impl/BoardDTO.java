package com.ssy.test.board.impl;

import java.sql.Date;
import java.util.List;

public class BoardDTO extends CommentDTO {
	
	//notice / qna 공통 dto
	
	private String title;
	private Long het;
	private List<BoardFileDTO> boardFileDTO;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getHet() {
		return het;
	}
	public void setHet(Long het) {
		this.het = het;
	}
	public List<BoardFileDTO> getBoardFileDTO() {
		return boardFileDTO;
	}
	public void setBoardFileDTO(List<BoardFileDTO> boardFileDTO) {
		this.boardFileDTO = boardFileDTO;
	}
	
	

}
