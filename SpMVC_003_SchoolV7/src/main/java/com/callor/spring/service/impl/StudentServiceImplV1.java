package com.callor.spring.service.impl;

import java.util.List;

import com.callor.spring.model.StudentVO;
import com.callor.spring.pesistance.StudentDao;
import com.callor.spring.service.StudentService;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(StudentVO vo) {
		// TODO Auto-generated method stub
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
