package com.callor.spring.service.impl;

import org.springframework.stereotype.Service;

import com.callor.spring.model.UserVO;
import com.callor.spring.service.UserService;

/*
 * UserServiceImplV1 클래스를 Component(bean) 로 등록하기
 */
@Service
public class UserServiceImplV1 implements UserService {

	@Override
	public UserVO login(UserVO userVO) {
		
		String username = userVO.getUsername();
		String password = userVO.getPassword();
		
		if(userVO.getUsername().equalsIgnoreCase("lee9805")
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
		
		return null;
	}

	
	
}
