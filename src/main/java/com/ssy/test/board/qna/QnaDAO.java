package com.ssy.test.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ssy.test.board.impl.BoardDAO;
import com.ssy.test.board.impl.BoardDTO;

public class QnaDAO implements BoardDAO{

	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ssy.test.board.qna.QnaDAO.";
	
	
	@Override
	public List<BoardDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList");
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getDetail", boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"setAdd", boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"setUpdate", boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"setDelte",boardDTO);
	}
	
	public int setReply(QnaDTO qnaDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setAdd", qnaDTO);
	}
}
