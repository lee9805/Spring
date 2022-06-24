package com.callor.memo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.memo.model.MemoVO;
import com.callor.memo.persistance.MemoDao;
import com.callor.memo.service.MemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemoServiceImplV1 implements MemoService {
	
	@Autowired
	private MemoDao memoDao;
	
	@Override
	public List<MemoVO> selectAll() {
		return memoDao.selectAll();
	}

	@Override
	public MemoVO findById(Long id) {
		return memoDao.findById(id);
	}

	@Override
	public int insert(MemoVO vo) {
		return memoDao.insert(vo);
	}

	@Override
	public int update(MemoVO vo) {
		return memoDao.update(vo);
	}

	@Override
	public int delete(Long id) {
		return memoDao.delete(id);
	}

	@Override
	public void create_memo_table() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String insertBbsAndFile(MemoVO memoVO, MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertBbsAndFiles(MemoVO memoVO, MultipartHttpServletRequest files) {
		// TODO Auto-generated method stub
		return null;
	}
}
