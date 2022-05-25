package com.callor.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.spring.model.UserVO;
import com.callor.spring.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/user")
public class UserController {

	private final UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	/*
	 * 1. login.form 에서 username 과 password
	 * 2. userVO에 담겨서 받게 도니다
	 * 3. userVO UserService.login 에게 전달한
	 * 4. UserService.login() method 는 ussername 과 password 검사
	 * 5. 정상적인(username, password 가 일치) 정보이면
	 *    나머지 user 정보를 userVO 에 담아서 return
	 *    만약 정상적인 사용자가 아니면 null 을 return
	 * 6. Controller.login.POST method 에는 
	 * 		HttpSession 클래스르 매개변수로 설정한다
	 * 7. 정상 사용자정며이면 userVO가 null이 아니면)
	 * 		setAttribute() method를 사용하여 사용자 정보를
	 * 		변수에 setting 한다
	 * 8. 정상 사용자가 아니면 removeAttribute() method 를 사용하여
	 * 		변수를 제해 버린다
	 */
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		
		return null;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(UserVO userVO, HttpSession session) {
		log.debug(userVO.toString());
		
		userVO = userService.login(userVO);
		if(userVO == null) {
			session.removeAttribute("USER");
		}else {
			session.setAttribute("USER", userVO);
		}
		return null;
	}
	@RequestMapping(value = "/logout",method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("USER");
		/*
		 * redirect
		 * 로그아웃이 끝나면
		 * web browser 의 주소창에 /user/login을 입력하고
		 * Enter 를 눌러라
		 */
		return "redirect:/user/login";
		
	}
}
