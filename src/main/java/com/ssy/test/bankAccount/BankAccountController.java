package com.ssy.test.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssy.test.bankMembers.BankMembersDTO;


@Controller
@RequestMapping("/bankAccount/*")
public class BankAccountController {
	
	@Autowired
	private BankAccountService bankAccountService;
	
	@RequestMapping(value = "add.ssy", method = RequestMethod.GET)
	public String add(BankAccountDTO bankAccountDTO, HttpSession session)throws Exception{
		System.out.println("BankAccoun Add");
		System.out.println(bankAccountDTO.getBookNum());
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("member");
		bankAccountDTO.setUserName(bankMembersDTO.getUserName());
		
		//DTO : userName, bookNum
		int result = this.bankAccountService.setAddAccount(bankAccountDTO);
		
		return "redirect:../bankbook/list.iu";
	}

}