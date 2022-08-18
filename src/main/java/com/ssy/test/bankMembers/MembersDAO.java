package com.ssy.test.bankMembers;

import java.util.ArrayList;
import java.util.List;

public interface MembersDAO {
	
	public int setJoin (BankMembersDAO bankMembersDAO) throws Exception;
	
	public List<BankMembersDTO> getSearchByID(String search) throws Exception;
	
	
	
}
