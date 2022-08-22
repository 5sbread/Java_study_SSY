package com.ssy.test.bankMembers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssy.test.bankBook.BankBookDTO;

@Repository
public class BankMembersDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ssy.test.bankMembers.BankMembersDAO.";
	
	//로그인
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getLogin",bankMembersDTO);
	}
	
	
	//회원가입
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setJoin", bankMembersDTO);
	}	
	
	//아이디 검색
	public List<BankMembersDTO> getSearchByID(String search) throws Exception{
		return null;
	}
	
	public BankMembersDTO getMyPage(BankMembersDTO bankMembersDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getMyPage", bankMembersDTO);
	}
}	

////Test -> Run as JUit Test
//public class BankBookMembersDAOTest extends MyAbstractTest{
//	
//	private BankMembersDAO bankMembersDAO;
//	BankMembersDTO
//}


//TEST 파일
//	private BankAccountDAO bankAccountACP;
//public void geTlistTest()th ex{
//	bankMembersDTO bankMembersDTO = new d--to;
//	bankdm.se
//}


// bankAccount 파일에 옮겨적기
//public class BankAccount{
//		private SqlSession sqlSession;
//		private final String NAMESPACE="com.ssy.test.bankAccount.BankAccountDAO.";
//		
//		public List<BankAccountDTO> getListByUserName(BankaaaaaDTO bankAccountDTO){
//			return sqlSession.selectlist(ff)
//}
//}





















