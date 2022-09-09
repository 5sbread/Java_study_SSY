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
	
	//댓글 수정
	public int setCommentUpdate(BankBookCommentDTO bankBookCommenrDTO) throws Exception{
		return bankBookCommentDAO.setCommentUpdate(bankBookCommenrDTO) ;
	}
	
	//댓글 삭제
	public int setCommentDelete(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		return bankBookCommentDAO.setCommentDelete(bankBookCommentDTO);
	}
	
	//댓글 추가
	public int setCommentAdd(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		return bankBookCommentDAO.setCommentAdd(bankBookCommentDTO);
	}
	
	
	public List<BankBookCommentDTO> getCommentList(CommentPager commentPager) throws Exception{
		commentPager.getRowNum();
		//댓글의 전체 페이지 수
		Long totalCount = bankBookCommentDAO.getCommentListTotalCount(commentPager);
		commentPager.makePage(totalCount);
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
		return bankBookDAO.setDelete(bankBookDTO);
	}
}
