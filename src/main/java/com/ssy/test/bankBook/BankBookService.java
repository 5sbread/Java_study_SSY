package com.ssy.test.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssy.test.util.CommentPager;

@Service
public class BankBookService {
	
//--- Comment -------------------------------------------------------------------------
	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	@Autowired
	private BankBookService bankBookService;
	
	
	public int setCommentAdd(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		return bankBookCommentDAO.setCommentAdd(bankBookCommentDTO);
	}
	
	
	public List<BankBookCommentDTO> getCommentList(CommentPager commentPager) throws Exception{
		commentPager.getRowNum();
		return bankBookCommentDAO.getCommentList(commentPager);
	}
	
	
//--- 기본 -------------------------------------------------------------------------
	@Autowired
	private BankBookDAO bankBookDAO;

	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setBankBook(bankBookDTO);
	}
	
	public List<BankBookDTO> getList() throws Exception{
		return bankBookDAO.getList();
	}
	
	public int setChangeScale (BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setChangeSale(bankBookDTO);
	}
	
	public BankBookDTO getDetail (BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.getDetail(bankBookDTO);
	}
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setDeleteBook(bankBookDTO);
	}
}
