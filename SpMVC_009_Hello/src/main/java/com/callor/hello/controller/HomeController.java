package com.callor.hello.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("NATION","졸려 죽는다 이러다가 집가고 싶다 언제 가지?");
		return "home";
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String home(String nation, String age) {
		
		System.out.println("집" + nation);
		System.out.println("나이" + age);
		return"home";
	}
	
	
}
