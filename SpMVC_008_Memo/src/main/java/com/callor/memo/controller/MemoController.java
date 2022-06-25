package com.callor.memo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.memo.model.MemoVO;
import com.callor.memo.service.FileUpService;
import com.callor.memo.service.MemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/list")
@SessionAttributes("memoVO")
public class MemoController {

	
	@Autowired
	private MemoService memoService;
	@Autowired
	private FileUpService fileupService;

	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insert(Model model, MemoVO memoVO ) {

	return "/list/insert";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute("memoVO") MemoVO memoVO,
							@RequestParam("up_file")  MultipartFile up_file,
							SessionStatus status,
							Model model) {
		log.debug(up_file.toString());
		

		try {
			String fileName = fileupService.fileUp(up_file);
			memoVO.setM_image(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		memoService.insert(memoVO);
		
		status.setComplete();
		return "redirect:/";
	}
	@RequestMapping(value="/fileups",method=RequestMethod.GET)
	public String upFiles(
			@ModelAttribute("memoVO")
			MemoVO bbsVO,
			Model mode) {
		return null;
	}
	
	@RequestMapping(value="/fileups",method=RequestMethod.POST)
	public String upFiles(
			
			@ModelAttribute("memoVO")
			MemoVO memoVO, 
			MultipartHttpServletRequest mFiles, 
			
			Model mode) {
		
			memoService.insertBbsAndFiles(memoVO, mFiles);
		
		
		return null;

	}	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(long id, Model model) {
		
		MemoVO memoVO = memoService.findById(id);
		model.addAttribute("MEMO", memoVO);
		return "list/detail";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(long id, @ModelAttribute("memoVO") MemoVO memoVO, Model model) {
		memoVO = memoService.findById(id);
		model.addAttribute("memoVO", memoVO);
		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(long id, Model model, 
			@ModelAttribute("memoVO") MemoVO memoVO, 
			@RequestParam("up_file") MultipartFile up_file,
			SessionStatus status) {
		log.debug(up_file.toString());
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

		try {
			String fileName = fileupService.fileUp(up_file);
			memoVO.setM_image(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		memoVO.setM_date(dayFormat.format(date));
		memoVO.setM_time(timeFormat.format(date));
		memoService.update(memoVO);
		
		status.setComplete();
		
		return "redirect:/";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String update(long id) {
		memoService.delete(id);
		return "redirect:/";
	}

	@ModelAttribute("memoVO")
	private MemoVO memoVO() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		MemoVO memoVO = MemoVO.builder()
						.m_date(dayFormat.format(date))
						.m_time(timeFormat.format(date))
						.m_author("dlthwjd1161@naver.com")
						.build();
		log.debug(memoVO.toString());
		return memoVO;
		
	}
}
