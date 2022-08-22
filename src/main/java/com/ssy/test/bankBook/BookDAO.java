package com.ssy.test.bankBook;

import java.util.List;

public interface BookDAO {

	public int setUpdate(BankBookDTO bankBookDTO) throws Exception;
	
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception;
	
	public List<BankBookDTO> getList() throws Exception;
	
	public int setChangeSale (BankBookDTO bankBookDTO) throws Exception;
	
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception;
}
