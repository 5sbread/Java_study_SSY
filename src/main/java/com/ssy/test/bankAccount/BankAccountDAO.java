package com.ssy.test.bankAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssy.test.bankMembers.BankMembersDTO;


@Repository
public class BankAccountDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.ssy.test.bankAccount.BankAccountDAO.";
	
	
	public List<BankAccountDTO> getListByUserName(BankMembersDTO bankMembersDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getListByUserName", bankMembersDTO);
	}
	
	public int setAddAccount(BankAccountDTO bankAccountDTO)throws Exception{
		
		return 0;
		
		
	}

}