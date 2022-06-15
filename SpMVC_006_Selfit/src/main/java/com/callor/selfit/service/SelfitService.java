package com.callor.selfit.service;

import org.springframework.ui.Model;

import com.callor.selfit.model.WorkoutDTO;


public interface SelfitService {

	public void startPage(Model model);

	public void getDaySetList(Model model, String sc_num);

	public void getDaySetList(Model model, String sc_num, String sc_id);

	public WorkoutDTO getDayHealth(String sc_id, String listid);
	
}
