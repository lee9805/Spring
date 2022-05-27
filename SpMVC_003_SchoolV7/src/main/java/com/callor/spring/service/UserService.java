package com.callor.spring.service;

import com.callor.spring.model.UserVO;
import com.callor.spring.pesistance.GenericDao;

public interface UserService extends GenericDao<UserVO, String> {

	public UserVO login(UserVO userVO);
	public UserVO join(UserVO userVO);
	
}
