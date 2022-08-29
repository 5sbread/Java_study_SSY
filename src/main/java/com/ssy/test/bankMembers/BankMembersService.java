package com.ssy.test.bankMembers;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class BankMembersService {
	
	@Autowired
	private BankMembersDAO bankMembersDAO;
	@Autowired
	private ServletContext servletContext;
	
	//로그인
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		return bankMembersDAO.getLogin(bankMembersDTO);
	}
	
	//회원가입
	public int setJoin (BankMembersDTO bankMembersDTO, MultipartFile photo) throws Exception{
		int result = bankMembersDAO.setJoin(bankMembersDAO);
		
		//1. HDD에 파일 저장
			//파일 저장시 파일의 경로 : Tomcat 기준이 아닌 OS기준
			//1) 파일 저장 위치
			//   /webapp/resources/upload/member
		
			//2) 저장할 폴더의 실제 경로 반환(OS 기준)
			String realPath = servletContext.getRealPath("resources/upload/member");
			System.out.println("Real Path : "+ realPath);
			
			//3) 저장할 폴더의 정보를 가지는 자바 객체 생성
			File file = new File(realPath);
			System.out.println(file.isDirectory());
			
			//*** File 첨부가 없을 때 구분
			//if(photo.getSize()!=0);
			if(photo.isEmpty()) {
			
			//파일이 존재하지 않는다면
			if(!file.exists()) {
				file.mkdirs();
			}
			
			//4) 중복되지 않는 파일명 생성
			//		- 시간, java api...
			String fileName= UUID.randomUUID().toString();
			System.out.println(fileName);
			Calendar ca = Calendar.getInstance();
			Long time = ca.getTimeInMillis();
			
			fileName = fileName+"_"+photo.getOriginalFilename();
			System.out.println(fileName);
			
			//5) HDD에 파일 저장
			file = new File(file, fileName);
			//-1) MultipartFile 클래스의 transferTo 메서드 사용
			photo.transferTo(file);
			
			//-2) FileCopyUtils 클래스의 copy 메서드 사용
			
		//2. 저장된 파일정보를 DB에 저장
		BankMembersFileDTO bankMembersfileDTO = new BankMembersFileDTO();
		bankMembersfileDTO.setFileName(fileName);
		bankMembersfileDTO.setOriName(photo.getOriginalFilename());
		bankMembersfileDTO.setUserName(bankMembersfileDTO.getUserName());
		bankMembersDAO.setAddFile(bankMembersfileDTO);
		}//1-3)isEmpty 구분
			
		return result; //bankMembersDAO.setJoin(bankMembersDTO);
	}
	
	//아이디 검색
	public List<BankMembersDTO> getSearchByID(String userName) throws Exception{
		return bankMembersDAO.getSearchByID(userName);
	}
	
	//마이페이지
	public BankMembersDTO getMyPage(BankMembersDTO bankMembersDTO)throws Exception{
		return bankMembersDAO.getMyPage(bankMembersDTO);
	}

}
