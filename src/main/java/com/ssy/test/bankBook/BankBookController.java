package com.ssy.test.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/bankBook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value="update.ssy", method = RequestMethod.POST)
	public ModelAndView delete(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setDelete(bankBookDTO);
		mv.setViewName("redirect:./list.ssy");
		return mv;
	}
	
	
	public void Update(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setUpdate(bankBookDTO);
		
		if(result>0) {
			System.out.println("수정 성공");	
		}else {
			System.out.println("수정 실패");
		}
	}
	
	@RequestMapping(value="update.ssy", method = RequestMethod.GET)
	public String update(BankBookDTO bankBookDTO, Model model)throws Exception{
		System.out.println("Update 페이지 접속");
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		System.out.println("DTO");
		
		model.addAttribute("detail", bankBookDTO);
		return "bankbook/update";
	}
	
	@RequestMapping(value="list.ssy", method = RequestMethod.GET)
	public String list(Model model) throws Exception{
		System.out.println("LIST");
		List<BankBookDTO> ar = bankBookService.getList();
		model.addAttribute("list", ar);
		return "bankbook/list";
	}
	
	@RequestMapping(value="detail.ssy", method = RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("DETAIL");
		//스프링이 하는 과정을 직접 객체를 만들어 보내도 됨
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		mv.setViewName("bankbook/detail");
		mv.addObject("detail", bankBookDTO);
		
		return mv;
	}
	
	@RequestMapping(value="add.ssy", method = RequestMethod.GET)
	public void add()throws Exception{
		System.out.println("ADD");
	}
	
	public ModelAndView add(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("ADD");
		System.out.println(bankBookDTO.getBookName());
		
		ModelAndView mv = new ModelAndView();
		
		int result = bankBookService.setBankBook(bankBookDTO);
		if(result>0) {
			System.out.println("succuse");
		}else {
			System.out.println("fail");
		}
		//상품 등록 후 리스트페이지로 이동
		mv.setViewName("redirect:./list.ssy");
		return mv;
	}
	
	
	
	
	
	
}
