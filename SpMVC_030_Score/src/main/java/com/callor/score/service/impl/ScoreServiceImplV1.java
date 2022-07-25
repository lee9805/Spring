package com.callor.score.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.callor.score.model.ScoreVO;
import com.callor.score.persistance.ScoreDao;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	@Autowired
	private ScoreDao SDao;
	
	@Override
	public List<ScoreVO> findByStNum(String sb_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScoreVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ScoreVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ScoreVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ScoreVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
