package com.iu.ssy.bankMembers;

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
public class MemberController {
	
	private BankMembersService bankMembersService;
	
	@RequestMapping(value = "login", method=RequestMethod.GET)
	public String login() {
		System.out.println("로그인 실행");
		return "member/login";
	}

	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(BankMembersDTO bankMembersDTO) throws Exception{
		System.out.println("DB에 로그인 실행");
		return "redirect:../";
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:../";
		
	}

	@RequestMapping(value = "/member/join.bh", method=RequestMethod.GET)
	public String join() throws Exception {
		System.out.println("회원가입 GET 실행");
		return "member/join"; //JSP 라서 확장자 X
	}

	@RequestMapping(value = "/member/join", method=RequestMethod.POST)

	public String join(BankMembersDTO bankMembersDTO) throws Exception {
	System.out.println("회원가입 POST 실행");

	return "redirect:./member/login.bh";	
	}

	@RequestMapping(value = "./search.bh", method =RequestMethod.GET)
	public ModelAndView getSearchByID () throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/view");
		return mv;
	}

	@RequestMapping(value="./search.bh", method=RequestMethod.POST)
	public String getSearchByID(String search, Model model) throws Exception{
		List<BankMembersDTO> ar = bankMembersService.getSearchByID(search);
		model.addAttribute("list", ar);
		return "member/list.bh";
	}






}