package com.callor.address.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.callor.address.model.AddressVO;
import com.callor.address.service.AddressService;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class HomeController {

	private final AddressService service;
	
	
	public HomeController(AddressService service) {
		this.service = service;
		}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, AddressVO addrVO) {
		List <AddressVO> addrList = service.selectAll();
		model.addAttribute("ADDRS", addrList);
		return "home";
	}
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String home( AddressVO addrVO) {
		log.debug("흠 :{}" , addrVO.toString());
		service.insert(addrVO);
		return "redirect:/";
	}
	@RequestMapping(value="/detail", method = RequestMethod.GET)
	public String detail(@RequestParam("seq") String strSeq, Model model) {
		
		log.debug("SEQ {}",strSeq);
		
		long a_seq = Long.valueOf(strSeq);
		log.debug("SEQ {}", a_seq);
		AddressVO addrVO = service.findById(a_seq);
		model.addAttribute("ADDR" , addrVO);
		
		return "detail";
	}
	@RequestMapping(value="update",method=RequestMethod.GET)
	public String update(@RequestParam("seq") String strSeq, Model model) {
		
		return "redirect:/";
	}
}
