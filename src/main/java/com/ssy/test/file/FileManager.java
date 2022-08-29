package com.ssy.test.file;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;

public class FileManager {
	
	@Autowired
	//private ServletContext servletContext;
	// =<mXontrolllerㅔ서ㅓ 라니
	
	//**파일 매니저 객체가 필요할 때 
	
	//save
	public void saveFile(ServletContext servletContext path, ###) throws Exception{
		//1. 실제 경로
		String realPath = servletContext.getRealPath(path);
		
		//2. 폴더 체크
		File file = new File(file, fileName);
		
				
				
	}

}
