package com.callor.memo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.callor.memo.model.MemoDTO;
import com.callor.memo.service.MemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/memo")
public class MemoController {

	@Autowired
	private MemoService memoService;
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insert(@ModelAttribute("MemoDTO") MemoDTO memo, HttpSession httpSession) {
		
		String username= (String) httpSession.getAttribute("USERNAME");
		if(username==null) {
			return "redirect:/user/login";
		}
		memo.setM_author(username);
		return "memo/input";
	}

	/*
	 * 泥⑤��뙆�씪�씠 �엳�뒗 �룷濡쒖젥�듃�뿉�꽌
	 * form �쓽 file input box type�쓽 �씠由꾩� �젅�� VO(DTO) �겢�옒�뒪�뿉
	 * �꽑�뼵�맂 �씠由꾩쓣 �궗�슜�븯硫� �븞�맂�떎 
	 */
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute("MemoDTO") MemoDTO memo, MultipartFile file,
													HttpSession httpSession){
		//硫붾え瑜� ���옣�븯湲� �쟾�뿉 �쁽�옱 session �뿉 ���옣�맂 username 媛��졇�삤湲�
		String username = (String) httpSession.getAttribute("USERNAME");
		//���옣�븷 硫붾え �젙蹂댁뿉 username �꽭�똿
		memo.setM_author(username);
		
		memoService.insertAndUpdate(memo, file);
		
		log.debug("硫붾え {}", memo.toString());
		log.debug("�뙆�씪{}", file.getOriginalFilename());
		return "redirect:/";
	}
	@RequestMapping(value="/{seq}/update",method=RequestMethod.GET)
	public String update(@PathVariable("seq") String seq,Model model) {
		
		// �쟾�떖諛쏆� seq �뿉 �빐�떦�븯�뒗 �뜲�씠�꽣 select
		MemoDTO memo = memoService.findById(Long.valueOf(seq));
		model.addAttribute("MEMO",memo);
		return "memo/input";
	}
	@RequestMapping(value="/{seq}/update",method=RequestMethod.POST)
	public String update(@PathVariable("seq") String seq,
			@PathVariable("memo")MemoDTO memoDTO,MultipartFile file,
			HttpSession httpSession) {
		//二쇱냼�뿉 �뵲�씪�삩 seq 蹂��닔媛믪쓣 異붿텧�븯�뿬 memoDTO �뿉 setting�븯湲�
		String username = (String) httpSession.getAttribute("USERNAME");
		if(username == null) {
			return "redirect:/user/login";
		}
		//濡쒓렇�씤�맂 �궗�슜�옄�쓽 �씠由꾩쓣 memoDTO �뿉 setting�븯湲�
		memoDTO.setM_author(username);
		
		
		long m_seq = Long.valueOf(seq);
		memoDTO.setM_seq(m_seq);
		
		log.debug(memoDTO.toString());
		memoService.insertAndUpdate(memoDTO, file);
		
		return String.format("redirect:/memo/%s/detail", seq);
	}
	
	@RequestMapping(value="/{seq}/detail",method=RequestMethod.GET)
	public String detail(@PathVariable("seq") String seq,
						@ModelAttribute("memo") MemoDTO memoDTO
						, Model model) {
		long m_seq = Long.valueOf(seq);
		
		memoDTO = memoService.findById(m_seq);
		model.addAttribute("MEMO",memoDTO);
		return "memo/detail";
	}
	@RequestMapping(value="/{seq}/delete",method=RequestMethod.GET)
	public String delete(@PathVariable("seq") String seq) {
		memoService.delete(Long.valueOf(seq));
		return"redirect:/"; 
	}
	
	@ModelAttribute("MemoDTO")
	private MemoDTO memoDTO() {
	
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat toDay = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat toTime = new SimpleDateFormat("HH:mm:SS");
		
		MemoDTO memo =  MemoDTO.builder()
						.m_date(toDay.format(date))
						.m_time(toTime.format(date))
						.build();
		return memo;
	}
	
}
