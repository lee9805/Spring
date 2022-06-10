package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.UserVO;

public interface UserDao extends GenericDao<UserVO, String>{

	public List<UserVO> findByName(String name);
	public List<UserVO> findByNickName(String nickname);
	/*
	 * Username, password 찾ㄱ기에서 email 을 활용하는 경우가 많기 때문에
	 * Email 칼럼을 unique 로 설정하는 경우가 많다
	 * db table 의 칼럼이 unique 라면 칼럼을 조건으로 selete 를 했을때
	 * Lsit 가 아닌 VO 가 추출될것이다
	 * 그렇다면 굳이 method의 return type 을 List<VO> 로 할 필요는 없다
	 */
	public UserVO findByEmail(String email);
	public void create_user_table();
	
}
