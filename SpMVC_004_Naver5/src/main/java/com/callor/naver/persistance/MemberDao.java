package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.MemberVO;

public interface MemberDao extends GenericDao<MemberVO, String> {
	
	public List<MemberVO> findByName(String name);
	public List<MemberVO> findByTel(String tel);
	public MemberVO findByEmail(String email);
	/*
	 * 회원의 ID 찾기 기능을 위하여
	 * 전화번호와 email을 ㅏ용하여  username을 조회할 수 있는 method
	 * 
	 * Entity  설계를 할때
	 * UNIQUE(email,tel) 형식으로 제약조건을 설정할 필요가 있다
	 */
	public MemberVO findByEmailAndTel(String email, String tel);
}
