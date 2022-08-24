package com.ssy.test.bankMembers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMembersService {
	
	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	//로그인
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		return bankMembersDAO.getLogin(bankMembersDTO);
	}
	
	//회원가입
	public int setJoin (BankMembersDTO bankMembersDTO) throws Exception{
		return bankMembersDAO.setJoin(bankMembersDTO);
	}
	
	//아이디 검색
	public List<BankMembersDTO> getSearchByID(String userName) throws Exception{
		return bankMembersDAO.getSearchByID(userName);
	}
	
	//마이페이지
	public BankMembersDTO getMyPage(BankMembersDTO bankMembersDTO)throws Exception{
		return bankMembersDAO.getMyPage(bankMembersDTO);
	}

}
