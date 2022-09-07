package com.ssy.test.bankBook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssy.test.util.CommentPager;

@Repository
public class BankBookCommentDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ssy.test.bankBook.BankBookCommentDAO.";
	
	public Long getCommentListTotalCount (CommentPager commentPager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getCommentListTotalCount", commentPager);
	}
	
	public int setCommentAdd(BankBookCommentDTO bankBookCommentDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setCommentAdd",bankBookCommentDTO);
	}
	
	public List<BankBookCommentDTO> getCommentList(CommentPager commentPager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getCommentList", commentPager);
	}
	
}
