package com.callor.selfit.service;

import org.springframework.ui.Model;


public interface SelfitService {

	public void startPage(Model model);

	public void getDaySetList(Model model, String sc_num);
	
}
