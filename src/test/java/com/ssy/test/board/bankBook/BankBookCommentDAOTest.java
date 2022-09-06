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
	public void getCommentListTest()throws Exception{
		CommentPager commentPager = new CommentPager();
		commentPager.setBookNum(1660194181698L);
		commentPager.setPage(1L);
		commentPager.getRowNum();
		List<BankBookCommentDTO> ar = bankBookCommentDAO.getCommentList(commentPager);
		assertNotEquals(0, ar.size());
	}

	//@Test
	public void setCommentAddTest()throws Exception{
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setWriter("reply");
	
	}
}	
