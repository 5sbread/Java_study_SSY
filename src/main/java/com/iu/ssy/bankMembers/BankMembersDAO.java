package com.iu.ssy.bankMembers;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.ssy.util.DBConnector;

@Repository("memDAO")
public class BankMembersDAO implements MembersDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.ssy.bankMembers.BankMembersDTO.";
	
	//로그인
	public BankMembersDTO getLogin (BankMembersDTO bankMembersDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getLogin", bankMembersDTO);
	}
	

	//회원가입
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setJoin", bankMembersDTO);
	}	
	
		
	public List<BankMembersDTO> getSearchByID(String search) throws Exception {
		return sqlSession.selectList(NAMESPACE+"getSearchByID", search);
	}

	@Override
	public int setJoin(BankMembersDAO bankMembersDAO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}	