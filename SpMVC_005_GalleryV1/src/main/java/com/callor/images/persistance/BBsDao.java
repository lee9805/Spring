package com.callor.images.persistance;

import com.callor.images.model.BBsVO;

public interface BBsDao  extends GenricDao<BBsVO, Long>{

	public void create_bbs_table();
	
	
}
