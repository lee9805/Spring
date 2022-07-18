package com.callor.address.persistence;

import java.util.List;

import com.callor.address.model.AddressVO;

public interface AddressDao {

	public List<AddressVO> selectAll();
	public AddressVO findById(Long a_seq);
	public int insert(AddressVO adress);
	public int update(AddressVO adress);
	public int delete(Long a_seq);
	public void create_addr_table();
	
}
