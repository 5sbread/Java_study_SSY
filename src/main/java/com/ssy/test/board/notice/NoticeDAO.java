package com.ssy.test.board.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ssy.test.board.impl.BoardDAO;
import com.ssy.test.board.impl.BoardDTO;

public class NoticeDAO implements BoardDAO{

	private SqlSession sqlSession;
	private final String NAMESPACE ="com.ssy.test.board.notice.NoticeDAO.";
	
	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getDetail",boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"setAdd",boardDTO);
	}

	@Override
	public int setUpDate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"setUpdate",boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"setDelte",boardDTO);
	}

	@Override
	public List<BoardDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	
	

}
