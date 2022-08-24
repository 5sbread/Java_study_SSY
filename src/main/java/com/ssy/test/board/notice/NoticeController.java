package com.ssy.test.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssy.test.board.impl.BoardDTO;

@Controller
@RequestMapping(value="/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//모든 멤버 메서드에 --
	@ModelAttribute("board")
	public String getBoard() {
		return "Notice";
	}
	
	//글목록
	@RequestMapping(value="list.ssy", method=RequestMethod.GET)
	public ModelAndView getList() throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> ar = noticeService.getLsit();
		
		mv.addObject("list", ar);
		mv.setViewName("notice/list");
		return mv;
	}
	
	//글 상세
	@RequestMapping(value="detail.ssy", method=RequestMethod.GET)
	public String getDetail(BoardDTO boardDTO, Model model) throws Exception{
		boardDTO = noticeService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "notice/detail";	
	}
	
	//글 작성
	@RequestMapping(value = "add.ssy", method = RequestMethod.GET)
	public String setAdd () throws Exception{
		return "notice/add";
	}
	
	@RequestMapping(value = "add.ssy", method = RequestMethod.POST)
	public ModelAndView setAdd(BoardDTO boardDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setAdd(boardDTO);
		mv.setViewName("redirectL./list.ssy");
		return mv;
	}
	
	//글 수정
	@RequestMapping(value = "update.ssy")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception{
		boardDTO = noticeService.getDetail(boardDTO);
		
		mv.addObject("boardDTO", boardDTO);
		mv.setViewName("notice/update");
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
	
	
	
	
	
	

}
