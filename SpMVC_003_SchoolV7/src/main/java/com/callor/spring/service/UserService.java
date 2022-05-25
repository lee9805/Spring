package com.callor.spring.service;

import com.callor.spring.model.UserVO;

public interface UserService {

	public UserVO login(UserVO userVO);
	public UserVO join(UserVO userVO);
	
}
