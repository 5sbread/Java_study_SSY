package com.ssy.test.board.bankBook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssy.test.bankBook.BankBookCommentDAO;
import com.ssy.test.bankBook.BankBookCommentDTO;
import com.ssy.test.board.notice.MyAbstractTest;
import com.ssy.test.util.CommentPager;

public class BankBookCommentDAOTest extends MyAbstractTest {
	
	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;

	@Test
	public void setCommentAddTest() throws Exception{
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setBookNum(123400L);
		bankBookCommentDTO.setWriter("BBB");
		bankBookCommentDTO.setContents("우,");
		
		int result = bankBookCommentDAO.setCommentAdd(bankBookCommentDTO);
		assertEquals(1, result);
	}
	
	
	
	//@Test
	public void getCommentListTest()throws Exception{
		CommentPager commentPager = new CommentPager();
		commentPager.setBookNum(1660194181698L);
		commentPager.setPage(1L);
		commentPager.getRowNum();
		List<BankBookCommentDTO> ar = bankBookCommentDAO.getCommentList(commentPager);
		
		assertNotNull(ar);
	}
	
	//@Test
	public void getCommentListToralCount () throws Exception{
		CommentPager commentPager = new CommentPager();
		bankBookCommentDAO.getCommentListTotalCount(commentPager);
	}
	
	//@Test
	public void setCommentDeleteTest () throws Exception{
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setNum(123L);
		
		int result = bankBookCommentDAO.setCommentDelete(bankBookCommentDTO);
		assertEquals(1, result);
	}
	
	@Test
	public void setCommentUpdateTest() throws Exception{
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setNum(1234L);
		bankBookCommentDTO.setContents("testestestest");
		
		int result = bankBookCommentDAO.setCommentUpdate(bankBookCommentDTO);
		assertEquals(1, result);
	}

	
}	
