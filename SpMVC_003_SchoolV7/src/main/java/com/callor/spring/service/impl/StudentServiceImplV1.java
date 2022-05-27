package com.callor.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.spring.model.StudentVO;
import com.callor.spring.pesistance.StudentDao;
import com.callor.spring.service.StudentService;

@Service
public class StudentServiceImplV1 implements StudentService{
	

	private final StudentDao stDao;
	
	public StudentServiceImplV1(StudentDao stDao) {
		this.stDao = stDao;
	}
	
	public List<StudentVO> selectAll() {
		List<StudentVO> stList =stDao.selectAll();
		return stList;
	}

	@Override
	public StudentVO findById(String id) {
		return stDao.findById(id);
	}

	/*
	 * 회원가입 처리를 하기
	 * 1. 최초로 회원갑입을 실행하는 가입자는 ADMIN role을 부여하기
	 * 2. 두번째 이후 회원가입을 실행하는 가입자는 USER role 부여하기
	 * 
	 */
	@Override
	public int insert(StudentVO vo) {
		
		return 0;
	}

	@Override
	public int update(StudentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
