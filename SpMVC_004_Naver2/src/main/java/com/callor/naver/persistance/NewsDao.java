package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.NewsVO;

public interface NewsDao extends GenericDao<NewsVO, String> {

	// 기본 CRUD 외에 필요한 method가 있을경우 별도로 얼마든지 추가할수 있다
 public List<NewsVO> findByTitle(String title);
	
}
