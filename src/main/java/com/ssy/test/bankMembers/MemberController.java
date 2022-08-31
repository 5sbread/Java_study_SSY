package com.ssy.test.bankMembers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/member/*")
public class MemberController {

	@Autowired
	private BankMembersService bankMembersService;

	//약관 동의
	@GetMapping("agree.ssy")
	public String getAgree() throws Exception{
		return "member/agree";
	}
	
	@RequestMapping(value = "myPage.ssy", method = RequestMethod.GET)
	public ModelAndView myPage(HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		BankMembersDTO bankMembersDTO = (BankMembersDTO) session.getAttribute("member");
		
		bankMembersDTO = bankMembersService.getMyPage(bankMembersDTO);
//		List<BankAccountDTO> ar = bankAccountService.getListByUserName(bankMembersDTO);
		
		mv.setViewName("member/myPage");
		mv.addObject("dto", bankMembersDTO);
		
		return mv;
	}
	
	
	//로그아웃
	@RequestMapping(value = "logout.ssy", method = RequestMethod.GET)
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:../";
	}
	
	
	//로그인 - 절대경로
	@RequestMapping(value = "login.ssy", method = RequestMethod.GET)
	public String login()throws Exception{
		System.out.println("로그인 접속 (GET)");
		
		return "member/login";
	}
	
	
	@RequestMapping(value = "login.ssy", method = RequestMethod.POST)
	public String login(HttpSession session, BankMembersDTO bankMembersDTO)throws Exception{
		System.out.println("DB로그인 접속 (POST)");
		bankMembersDTO = bankMembersService.getLogin(bankMembersDTO);
		session.setAttribute("member", bankMembersDTO);
		return "redirect:../";
	}
	
	
	//회원가입
	@RequestMapping(value = "join.ssy", method = RequestMethod.GET)
	public String join()throws Exception {
		System.out.println("회원가입 접속 (GET)");
		
		return "member/join";
	}
	
	
	@RequestMapping(value = "join.ssy", method = RequestMethod.POST)
	public String join(BankMembersDTO bankMembersDTO, MultipartFile photo, ServletContext servletContext)throws Exception {
		System.out.println("회원가입 접속 (POST)");
		System.out.println(photo);
		
		 System.out.println("upload 파일명 : "+photo.getOriginalFilename());
		System.out.println("upload 파라미터명 : "+photo.getName());
		System.out.println("file size : "+photo.getSize());
		
		//int result = bankMembersService.setJoin(bankMembersDTO);
//		if(result>0) {
//			System.out.println("회원가입 성공!");
//		}else {
//			System.out.println("회원가입 실패..");
//		}
		
		return "redirect:./login.ssy";
		
	}
	
	
	@RequestMapping(value = "search.ssy", method = RequestMethod.GET)
	public void getSearchByID()throws Exception{
		System.out.println("아이디 검색중 (GET)");
		//return "member/search";
	}
	
	@RequestMapping(value = "search.ssy", method = RequestMethod.POST)
	public String getSearchByID(String search, Model model)throws Exception{
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		List<BankMembersDTO> ar= bankMembersService.getSearchByID(search);
		
		
		model.addAttribute("list", ar);
		return "member/list";
	}
	
//	@RequestMapping(value = "search.ssy", method = RequestMethod.POST)
//	public ModelAndView search(String userName)throws Exception{
//		System.out.println("아이디 검색중 (POST)");
//		ModelAndView mv = new ModelAndView();
//		
//		List<BankMembersDTO> ar = bankMembersService.getSearchByID(userName);
//		
//		//경로와 데이터를 함께 보낼때
//		mv.setViewName("member/list");
//		mv.addObject("list", ar);
//		
//		return mv;
//	}
//	
//	@RequestMapping(value = "list.ssy", method = RequestMethod.GET)
//	public void list()throws Exception{
//		
//	}
	
}