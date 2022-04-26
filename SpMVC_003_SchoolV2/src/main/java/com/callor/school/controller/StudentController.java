package com.callor.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.service.StudentService;

/*
 * Controller level 에 @RequestMapping을 설정하면
 * Controller의 mapping 과 method 의 mapping 서로 연결되어
 * RequestMapping을 구성한다
 * localhost:8080/school/student/list : StudentController 의 mapping 이 연결
 * localhost:8080/school/student/list : StudentController#list() 의 mappint 이 연결
 * 
 */
@RequestMapping(value ="/student")
@Controller
public class StudentController {
	
	/*
	 * Dependency inject 중
	 * 생성자 injection
	 */
	private final StudentService stService;
	public StudentController(StudentService stService) {
		this.stService = stService;
	}
	
	/*
	 * return type 이 String type인 method의 경우
	 * null 값을 return 하면 Request Path 와 같은 jsp 파일을 찾아서
	 * rendering 을 수행한다.
	 * 단, @ResponseBody 설정이 없어야 한다.
	 */
	@RequestMapping(value = "/list_view", method = RequestMethod.GET)
	public String list_view() {
		
		return null;
	}
	@RequestMapping(value="/input", method = RequestMethod.GET)
	public String input() {
		return null;
	}
	@RequestMapping(value="/detail_view", method = RequestMethod.GET)
	public String detail_view() {
		return null;
	}
	@RequestMapping(value="/update", method = RequestMethod.GET)
	public String update() {
		return null;
	}
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public String delete( ) {
		return "student/delete";
	}
	
}
