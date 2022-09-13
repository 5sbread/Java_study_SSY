package com.ssy.test.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssy.test.bankMembers.BankMembersDAO;
import com.ssy.test.bankMembers.BankMembersDTO;
import com.ssy.test.board.impl.BoardDTO;
import com.ssy.test.util.Pager;

@Controller
@RequestMapping(value="/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//모든 멤버 메서드에 공통 Data를 model에 담기
	@ModelAttribute("board")
	public String getBoard() {
		return "notice";
	}
	
	// 파라미터의 이름과 매개변수명이 일치하지 않는 경우
	// @RequestParam(value="파라미터명") 매개변수데이터타입 매개변수명
	
	// 파라미터 값이 안넘어갈 때 자동세팅값 설정
	// public ModelAndView gerList(@RequestParam(defaultValue="1")Long page) throws Exception{
	
	//글 목록
	@RequestMapping(value="list.ssy", method=RequestMethod.GET)
	public ModelAndView getList(Pager pager) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		System.out.println(pager);
		//System.out.println("page : "+page);
		System.out.println(pager.getSelect());
		System.out.println(pager.getSearch());
		
		List<BoardDTO> ar = noticeService.getList(pager);
		
		mv.addObject("list", ar);
		mv.addObject("pager",pager);
		mv.setViewName("board/list");
		//mv.setViewName("board/list"); <- 이렇게 경로 전부 바꾸기 notice/qna
		
//		if(ar.size() !=0 ) {
//			throw new Exception();
//		}
		
		return mv;
	}
	
	
	//글 상세
	@RequestMapping(value="detail.ssy", method=RequestMethod.GET)
	public String getDetail(BoardDTO boardDTO, Model model) throws Exception{
		boardDTO = noticeService.getDetail(boardDTO);
		
		model.addAttribute("boardDTO", boardDTO);
		return "board/detail";	
	}
	
	
	//글 작성
	@RequestMapping(value = "add.ssy", method = RequestMethod.GET)
	public String setAdd (HttpSession session) throws Exception{
		
		BankMembersDTO bankMemberDTO = (BankMembersDTO)session.getAttribute("member");
		
		if(bankMemberDTO != null) {
			return "board/add";
		}else {
			return "redirect:../member/login.ssy";
		}
	}
	
	
	@RequestMapping(value = "add.ssy", method = RequestMethod.POST)
	public ModelAndView setAdd(BoardDTO boardDTO, MultipartFile [] files, HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setAdd(boardDTO, files, session.getServletContext());
		mv.setViewName("redirect:./list.ssy");
		return mv;
	}
	
	
	//글 수정
	@RequestMapping(value = "update.ssy")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception{
		boardDTO = noticeService.getDetail(boardDTO);
		
		mv.addObject("boardDTO", mv);
		mv.setViewName("board/update");
		return mv;
	}
	
	
	@RequestMapping(value = "update.ssy", method = RequestMethod.POST)
	public String setUpdate(BoardDTO boardDTO)throws Exception{
		int result = noticeService.setUpdate(boardDTO);
		
		return "redirect:./detail.ssy?num="+boardDTO.getNum();
	}
	
	
	//글 삭제
	public String setDelete(BoardDTO boardDTO) throws Exception{
		int result = noticeService.setDelete(boardDTO);
		return "redirect:./list.ssy";
	}
	
	
	
//--------------------------------------------------------------------
	// exception 처리 전문 메서드
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView exceptionTest() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error/error_404");
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionTest2 (Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error/error_404");
		return mv;
	}
	
	
	

}
