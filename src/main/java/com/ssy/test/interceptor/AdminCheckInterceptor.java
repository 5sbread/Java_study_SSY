package com.ssy.test.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ssy.test.bankMembers.BankMembersDTO;
import com.ssy.test.bankMembers.RoleDTO;

public class AdminCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
				// 접근을 아예 막는 메서드
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 1. 접근자의 권한 확인 - admin이면 통과
		BankMembersDTO bankMembersDTO = (BankMembersDTO)request.getSession().getAttribute("member");
		
		boolean check = false;
		
		for(RoleDTO roleDTO:bankMembersDTO.getRoleDTOs()) {
			roleDTO.getRoleName();
			System.out.println(roleDTO.getRoleName());
			
			if(roleDTO.getRoleName().equals("admin")) {
				check = true;
				break;
			}
		}
		
		//admin 이 아닐 때
		if(!check) {
			request.setAttribute("message", "권한이 없습니다.");	
			request.setAttribute("url", "../../../../../");
																	//URL 경로
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/member.jsp");
				view.forward(request, response);		
		}
		return check;
	
	}
}
