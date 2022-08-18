package com.ssy.test.bankBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/book/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value="detail.ssy", method=RequestMethod.POST)
	public String detail() throws Exception {
		System.out.println("bankBook Detail 조회");
		return "/book/detail";
	}
	

}
