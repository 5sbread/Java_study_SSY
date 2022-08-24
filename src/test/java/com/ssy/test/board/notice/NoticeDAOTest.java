package com.ssy.test.board.notice;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssy.test.board.impl.BoardDTO;

public class NoticeDAOTest extends MyAbstractTest{
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Test
	public void getListTest()throws Exception{
		 List<BoardDTO> ar = noticeDAO.getList();
		 assertEquals(0, ar.size());
	}
		
	
	@Test
	public void setAddTest () throws Exception{
		
		for(int i=0; i<100; i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setTitle("Title"+i);
			noticeDTO.setWriter("Writer"+i);
			noticeDTO.setContents("Contents"+i);
			
			int result = noticeDAO.setAdd(noticeDTO);
			
			
			if(i%10==0) {
				Thread.sleep(500);
			}
		}
		System.out.println("Finish");
	}

}
