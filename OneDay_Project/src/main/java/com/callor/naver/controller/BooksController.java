package com.callor.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/books")
public class BooksController {

	@RequestMapping(value="/Books", method=RequestMethod.GET)
	public String books() {
		return null;
	}
}
