package com.callor.app.service;

import com.callor.app.domain.StudentVO;

public interface StudentService { //interface : 설계하기
	
	public int insert(StudentVO studentVO); // insert(추가하기) : 학생 정보를 추가하기
	public StudentVO[] selectAll(); // selectAll(전체 선택) : 학생 정보 전체 가져오기
	public StudentVO findById(String stNum); // findById(유일한 데이터) : 특정 1개의 데이터를 가져오기

}
