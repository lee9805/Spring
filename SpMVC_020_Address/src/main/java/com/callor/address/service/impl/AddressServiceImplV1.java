package com.callor.address.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.address.config.QualifyConfig;
import com.callor.address.model.AddressVO;
import com.callor.address.persistence.AddressDao;
import com.callor.address.service.AddressService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifyConfig.SERVICE.ADDR_V1)
public class AddressServiceImplV1 implements AddressService {

	/*
	 * Service interface 에서 Dao 를 상속받ㅇ고 있는 상태에서
	 * ServiceImpl 클래스에서Dao 를 생성자로 주입받는 경우
	 * 생성자에서 오류가 발생하는 경우가 있다 **ciclear : 무한반복 주입 오류
	 * 이 오류가 발생하는 경우 생성자 주입 대신 setter주입으로 변경하면
	 * 오류가 발생하지 않는다
	 */
	private final AddressDao addrDao;
	
	public AddressServiceImplV1(AddressDao addrDao) {
		this.addrDao =addrDao;
	}
	@Override
	public List<AddressVO> selectAll() {
		return addrDao.selectAll();
	
	}
	

	@Override
	public AddressVO findById(Long a_seq) {
		
		return addrDao.findById(a_seq);
	}

	@Override
	public int insert(AddressVO address) {
		log.debug("서비스에서 받은 데이터 : {}", address.toString());
		addrDao.insert(address);
		return 0;
	}

	@Override
	public int update(AddressVO adress) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long a_seq) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Autowired
	public void create_table() {
		addrDao.create_addr_table();
		
	}
	
	@Override
	public void create_addr_table() {
	}

}
