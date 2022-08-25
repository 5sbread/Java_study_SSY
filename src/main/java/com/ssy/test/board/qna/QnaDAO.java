package com.ssy.test.board.qna;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssy.test.board.impl.BoardDAO;
import com.ssy.test.board.impl.BoardDTO;
import com.ssy.test.util.Pager;

import oracle.net.aso.b;

@Repository
public class QnaDAO implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ssy.test.board.qna.QnaDAO.";
	
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList", pager);
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

	@Override
	public Long getCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int setReplyAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"setReplyAdd", boardDTO);
	}
	
	public int setStepUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"setStepUpdate", boardDTO);
}
