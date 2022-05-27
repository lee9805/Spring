package com.callor.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.spring.model.UserVO;
import com.callor.spring.pesistance.UserDao;
import com.callor.spring.service.UserService;

/*
 * UserServiceImplV1 클래스를 Component(bean) 로 등록하기
 */
@Service
public class UserServiceImplV1 implements UserService {

	private final UserDao userDao;
	
	public UserServiceImplV1(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public UserVO login(UserVO userVO) {
		
		String username = userVO.getUsername();
		String password = userVO.getPassword();
		
		if(username.equalsIgnoreCase("lee.98")
					&& password.equals("12341234")) {
			userVO.setName("이소정");
			userVO.setRole("ADMIN");
			userVO.setEmail("dlthwjd1161@naver.com");
		}else {
			userVO = null;
		}
		
		return userVO;
	}

	@Override
	public UserVO join(UserVO userVO) {
		
		//1.user table 에 데이터가 있는지 확인하기 위하여
		//		전체 데이터를 select 하기
		List<UserVO> userList = userDao.selectAll();
		if(userList == null || userList.size() < 1) {
			//데이터가 없으면 최초 가입자 이므로
			//role(권한)을 ADMIN(관리자)로 부여한다
			userVO.setRole("ADMIN");
		}else {
			userVO.setRole("USER");
		}
		userDao.insert(userVO);
		
		return null;
	}

	@Override
	public List<UserVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public int insert(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
