package com.ssy.test.bankBook;

import org.apache.ibatis.session.SqlSession;

public class BankBookDAO implements BookDAO{
	
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ssy.test.bankBook.BankBookDAO";
	
	
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception{
		return SqlSession.**(NAMESPACE+"getDetail",bankBookDTO);
	}
}
