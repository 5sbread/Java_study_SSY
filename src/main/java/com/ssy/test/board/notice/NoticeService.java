package com.ssy.test.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.ssy.test.board.impl.BoardDTO;
import com.ssy.test.board.impl.BoardService;
import com.ssy.test.util.Pager;

@Service
public class NoticeService implements BoardService{
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		pager.getRowNum();
		Long totalCount = noticeDAO.getCount();
		pager.getNum(totalCount);
		
//		System.out.println("Service Page : "+page);
//		
//		Long perPage = 15L; //한 페이지에 출력할 목록의 갯수
//		// 페이지에 15개씩 출력 기준
//		// page      startRow      lastRow
//		//  1            1            15
//		//  2           16            30
//		
//		Long startRow=(page-1)*perPage+1;
//		Long lastRow=page*perPage;
//		
//		System.out.println("StartRow : "+startRow);
//		System.out.println("LastRow : "+lastRow);
//		Map<String, Long> map= new HashMap<String, Long>();
//		map.put("startRow", startRow);
//		map.put("lastRow", lastRow);
//		
//		/***************************
//		 * JSP에 페이지 번호를 출력 1-?
//		 * 1. 글의 총 갯수
//		 * *************************/
//		Long totalCount = noticeDAO.getCount();
//		
//		/**************************
//		 * 2. 글의 총 페이지수
//		 **************************/
//		Long totalPage = totalCount/perPage;
//		if(totalCount%perPage != 0) {
//			totalPage++;
//		}
//		
//		/**************************
//		 * 3. totalBock 갯수 구하기
//		 * Bolck : 
//		 * perBlock  : 한 페이지에 출력할 번호와 수 
//		 **************************/
//		
//		
//		
//		/****************************
//		 * 4.
//		 */
//		Long curBlock = page/perBlock;
//		if(page%perBlock !=0) {}
//		curBlock++;
//		
//		/****************************
//		 * 5. curBlock 으로 시작번호와 끝번호 알아내기
//		 */
//		Long startNum = (curBlock-1)*perBlock+1;
//		Long lastNum = curBlock*perBlock;
		
		return noticeDAO.getList(pager);		
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setAdd(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}
	
	

}
