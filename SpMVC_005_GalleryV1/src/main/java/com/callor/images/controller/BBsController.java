package com.callor.images.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.images.model.BBsVO;
import com.callor.images.persistance.BBsDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/bbs")
public class BBsController {

	@Autowired
	private BBsDao bbsDao;
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public String write(Model model) {
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		 
		BBsVO bbsVO = BBsVO.builder()
					.b_date(dayFormat.format(date))
					.b_time(timeFormat.format(date))
					.b_writer("lee98")
					.build();
		model.addAttribute("BBS",bbsVO);
		return "bbs/input";
	}
	@RequestMapping(value="/write",method=RequestMethod.POST)
	public String write(BBsVO bbsVO) {
		
		log.debug("=".repeat(100));
		log.debug("INSERT 전 {}", bbsVO.getB_seq());
		bbsDao.insert(bbsVO);
		log.debug("INSERT 후 {}", bbsVO.getB_seq());
		
		return "redirect:/";
	}
	
}
