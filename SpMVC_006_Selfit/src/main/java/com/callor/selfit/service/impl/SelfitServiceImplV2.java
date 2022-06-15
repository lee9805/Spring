package com.callor.selfit.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.callor.selfit.config.QualifileConfig;
import com.callor.selfit.model.StartMenuDTO;
import com.callor.selfit.model.WorkoutDTO;
import com.callor.selfit.persistance.SelfitDao;

@Service(QualifileConfig.SERVICE.SELFIT_V2)
public class SelfitServiceImplV2 extends SelfitServiceImplV1 {


	public SelfitServiceImplV2(SelfitDao selfitDao) {
		super(selfitDao);
	}

	@Override
	public void startPage(Model model) {

		List<StartMenuDTO> beginMenus = selfitDao.selectByScNum("01");
		List<StartMenuDTO> middleMenus = selfitDao.selectByScNum("02");
		List<StartMenuDTO> advMenus = selfitDao.selectByScNum("03");

		model.addAttribute("BEGIN", beginMenus);
		model.addAttribute("MIDDLE", middleMenus);
		model.addAttribute("ADV", advMenus);
		
	}

	@Override
	public void getDaySetList(Model model, String sc_num) {
		super.getDaySetList(model, sc_num);
		List<StartMenuDTO> dayList = (List<StartMenuDTO>) model.getAttribute("DAYS");
		
		String sc_id = dayList.get(0).getSc_id();
		
		//sc_id를 매개변수로 전달하여 view_workout의 데이터를 가져오기
		List<WorkoutDTO> workList = selfitDao.selectWorkout(sc_id);
		
		model.addAttribute("WORKS",workList);
	}
	@Override
	public void getDaySetList(Model model, String sc_num, String sc_id) {
		super.getDaySetList(model, sc_num);
		List<WorkoutDTO> workList = selfitDao.selectWorkout(sc_id);
		model.addAttribute("WORKS",workList);
	}
	@Override
	public WorkoutDTO getDayHealth(String sc_id, String listid) {
		
		return selfitDao.seleDayHealth(sc_id, listid);
	}
}