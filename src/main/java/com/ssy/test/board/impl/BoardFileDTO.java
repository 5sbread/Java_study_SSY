package com.ssy.test.board.impl;

import com.ssy.test.file.FileDTO;

public class BoardFileDTO extends FileDTO{

	//Notice, Qna 같이 사용
	//Mapper는 각각 작성
	
	private Long num;

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	//파일 추가
	public void setFileNum(String originalFilename) {
		// TODO Auto-generated method stub
		
	}
}
