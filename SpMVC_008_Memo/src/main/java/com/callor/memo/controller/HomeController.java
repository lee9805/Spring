package com.callor.memo.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.callor.memo.model.MemoVO;
import com.callor.memo.persistance.MemoDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	private final MemoDao memoDao;
	
	public HomeController(MemoDao memoDao) {
		this.memoDao=memoDao;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
		List<MemoVO> memoList = memoDao.selectAll();
		model.addAttribute("MEMOS",memoList);
		return "home";
	}
	
}
