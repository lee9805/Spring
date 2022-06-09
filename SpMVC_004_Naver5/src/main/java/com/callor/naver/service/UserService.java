package com.callor.naver.service;

import org.springframework.stereotype.Service;

import com.callor.naver.model.UserVO;
import com.callor.naver.persistance.UserDao;

@Service
public interface UserService extends UserDao {

	public UserVO login(UserVO userVO);

	public int join(UserVO userVO);
}
