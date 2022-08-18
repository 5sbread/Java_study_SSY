package com.ssy.test.bankMembers;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssy.test.MyAbstractTest;



public class BankMembersDAOTest extends MyAbstractTest{

	@Autowired
	private BankMembersDAO bankMembersDAO;
	@Autowired
	private BankMembersDTO bankMembersDTO;
	
	@Test
	public void setJoinTest() throws Exception{
		int result = bankMembersDAO.setJoin(bankMembersDTO);
		throw new Exception(); //예외 만들기
		//assertEquals(1, result);
	}

	@Test
	public void getLoginTest()throws Exception{
		Object obj = bankMembersDAO.getLogin(bankMembersDTO);
		assertNull(obj);
	}
	
	@Test
	public void getSearchbyID()throws Exception{
		List<BankMembersDTO> ar = bankMembersDAO.getSearchByID("ad");
		
		assertNotEquals(0, ar.size());
	}

}
