package com.ssy.test.board.bankBook;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssy.test.bankBook.BankBookCommentDAO;
import com.ssy.test.bankBook.BankBookCommentDTO;
import com.ssy.test.board.notice.MyAbstractTest;

public class BankBookCommentTest extends MyAbstractTest {
	
	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;

	@Test
	public void setCommentAddTest() throws Exception{
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setBookNum(565656L);
		bankBookCommentDTO.setContents("bbhh");
		bankBookCommentDTO.setWriter("bh");
		
		int result = bankBookCommentDAO.setCommentAdd(bankBookCommentDTO);
		assertEquals(1, result);
	}
	
}
