package com.ssy.test.bankMembers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/member/*")
public class MemberController {

	@Autowired
	private BankMembersService bankMembersService;

	@RequestMapping(value="myPage.ssy", method = RequestMethod.GET)
	public ModelAndView myPage(HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("member");
		bankMembersDTO = bankMembersService.getMyPage(bankMembersDTO);
		
			//ModelAndView일때는 object | 
		mv.addObject("dto", bankMembersDTO);
		mv.setViewName("member/myPage");
		return mv;
	}
	
	
	
	@RequestMapping(value="login.ssy", method = RequestMethod.POST)
	public String login() throws Exception{
		System.out.println("로그인 접속 GET");
		return "member/login";
	}
	
	
	public String login(BankMembersDTO bankMembersDTO) throws Exception{
		System.out.println("로그인 접속 POST");
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("member/login");
		mv.addObject("login", bankMembersDTO);
		return "member/login";
	}
	
	
	
//	
//	@RequestMapping(value="join.ssy", method = RequestMethod.GET)
//	public void join() throws Exception {
//		System.out.println("회원가입");
//	}
//
//	public String jon(BankMembersDTO bankMembersDTO) throws Exception{
//		System.out.println("회원가입");
//		
//		
//	}

}