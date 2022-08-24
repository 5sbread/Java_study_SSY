package com.ssy.test.util;

public class Pager {
	
	/**
	 * Parameter를 담을 변수
	 * jsp 에서 꺼내서 사용할 변수
	 * mapper 에서 사용할 변수
	 * ㄴ startRow / lastRow
	 * 
	 * perPage : 한페이지에 출력할 글의 갯수
	 * perBlock : 한페이지에 출력할 번호의 갯수
	 */

	private Long page;
	private Long startNum;
	private Long lastNnum;
	private Long startRow;
	private Long lastRow;
	private Long perPage;
	private Long perBlock;
	
	public Pager() {
		this.perPage=10L;
		this.perBlock=5L;
	}
	
	//1. mapper에서 사용할 값 계산
	public void getRowNum() throws Exception{
		this.startRow = (this.getPage()-1)*getPerPage()+1;
		this.lastRow = this.getPerPage()*this.getPerPage();
	}
	
	//2. jsp에서 사용할 값 계산
	public void getNum(Long totalCount)throws Exception{
		//2) totalCount로 totalPage 계산
		Long totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage() !=0 ) {
			totalPage++;
		}
		
	//3. totalPage로 totalBlock 구하기
		Long totalBlock = totalPage/this.getPerBlock();
		if(totalPage%this.getPerBlock() !=0) {
			totalBlock++;
		}
		
	//4. page로 curBlock 찾기	
		Long curBlock = this.getPage()/this.getPerBlock();
		if(this.getPage()%this.getPerBlock() !=0) {
			curBlock++;
		}
		
	//5. cutBlock르호 startNum, lastNum 구하기
		this.startNum = (curBlock-1)*this.getPerBlock()+1;
		this.lastNnum = curBlock*this.getPerBlock();      
		
	}
	
	
	public Long getPage() {
		if(this.perPage==null) {
			this.perPage=10L;
		}	
		return perPage;
	}
	
	public void setPage(Long page) {
		this.page = page;
	}
	
	public Long getStartNum() {
		return startNum;
	}
	
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	
	public Long getLastNnum() {
		return lastNnum;
	}
	
	public void setLastNnum(Long lastNnum) {
		this.lastNnum = lastNnum;
	}
	
	public Long getPerPage() {
		return perPage;
	}
	
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	
	public Long getStartRow() {
		return startRow;
	}
	
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	
	public Long getLastRow() {
		return lastRow;
	}
	
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	
	public Long getPerBlock() {
		return perBlock;
	}
	
	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}
	
	
}
