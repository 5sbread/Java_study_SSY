package com.ssy.test.board.qna;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssy.test.board.impl.BoardDTO;
import com.ssy.test.board.impl.BoardService;
import com.ssy.test.board.notice.NoticeDAO;
import com.ssy.test.util.Pager;

@Service
public class QnaService implements BoardService{

	@Autowired
	private QnaDAO qnaDAO;

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		//System.out.println("Service Page : "+page);
		//Map<String, Long> map= new HashMap<String, Long>();
		
		Long totalCount = qnaDAO.getCount(pager);
		pager.getNum(totalCount);
		pager.getRowNum();
		return qnaDAO.getList(pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		return qnaDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		System.out.println(boardDTO.getNum());
		int result = qnaDAO.setAdd(boardDTO);
		System.out.println(boardDTO.getNum());
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		return qnaDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return qnaDAO.setDelete(boardDTO);
	}
	
	public int setReply(QnaDTO qnaDTO)throws Exception{
		return qnaDAO.setReply(qnaDTO);
	}

}
