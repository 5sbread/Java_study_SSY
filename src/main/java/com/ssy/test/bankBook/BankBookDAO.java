package com.ssy.test.bankBook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO implements BookDAO{

	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ssy.test.bankBook.BankBookDAO.";
	
	@Override
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setUpdate",bankBookDTO);
	}
	@Override
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setBankBook", bankBookDTO);
	}
	@Override
	public List<BankBookDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList", NAMESPACE);
	}
	@Override
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setChangeScale", bankBookDTO);
	}
	@Override
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getDetail", bankBookDTO);
	}
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setDelete", bankBookDTO);
	}
}
