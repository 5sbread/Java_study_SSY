package com.iu.ssy.bankMembers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMembersService {
	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	
	public int setJoin (BankMembersDAO bankMembersDAO) throws Exception{
		return bankMembersDAO.setJoin(bankMembersDAO);	
	}
	
	public List<BankMembersDTO> getSearchByID(String search) throws Exception{
		return bankMembersDAO.getSearchByID(search);
	}
	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		return bankMembersDAO.getLogin(bankMembersDTO);
	}

}
