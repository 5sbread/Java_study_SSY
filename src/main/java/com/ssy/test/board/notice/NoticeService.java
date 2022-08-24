package com.ssy.test.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.ssy.test.board.impl.BoardDTO;
import com.ssy.test.board.impl.BoardService;

@Service
public class NoticeService implements BoardService{
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<BoardDTO> getList(Long page) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service Page : "+page);
		
		Long startRow=0L;
		Long lastRow=page*10;
		
		System.out.println("StartRow : "+startRow);
		System.out.println("LastRow : "+lastRow);
		
		return noticeDAO.getList();		
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setAdd(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}
	
	

}
