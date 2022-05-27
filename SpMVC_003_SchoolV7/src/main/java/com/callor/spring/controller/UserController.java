package com.callor.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String login(UserVO userVO, HttpSession session, Model model) {
		// 로그인 폼에서 입력한 username, password 는 userVO에 담겨
		//이곳에 도착한다
		log.debug(userVO.toString());
		
		// Server와 view 사이에서 약속 Protocol을 사용하기 위하여
		String loginMessage= null;
		
		
		
		// 로그인 폼에서 전송된 데이터 중 username  으로
		// findById() 즉 SelectOne(username) 을 실행한다
		//그리고 결과를 loginUserVO에 담는다
		//만약 username 정보가 user table에 없으면
		// 결과는 null이고, 정보가 있으면 관련데이터가 포함된 VO가 만들어진다
		UserVO loginUserVO = userService.findById(userVO.getUsername());
		//username 이 가입된적이 없을때
		if(loginUserVO == null ) {
			//가입된적이 없다는 Key word를 생성하고
			loginMessage = "USERNAME FAIL";
		}else
		//username은 있는데 password가 다를 경우
		if( !loginUserVO.getPassword().equals(userVO.getPassword())) {
			//비밀번호가 잘못되었다는 key word를 생성하고
			loginMessage = "PASSWORD FAIL";	
		}
		
		//로그인 되었는지 그렇지 않은지 세션에 setting
		if(loginMessage == null) {
			session.setAttribute("USER", loginUserVO);
		}else {
			session.removeAttribute("USER");
		}
		//view로 보낼 message Protocol을 setting
		model.addAttribute("LOGIN_MESSAGE",loginMessage);
		return "user/login_ok";
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
	@RequestMapping(value = "/join",method=RequestMethod.GET)
	public String join() {
		
		/*
		 * 이 메서드를 요청하는 url은
		 * url/join 이다
		 *
		 * return null을 실행하면
		 * return user/join 을 실행한것과 같다
		 * views/user/join.jsp를 rendering 하라는 의미
		 */
		return null;
	}
	@RequestMapping(value = "/join",method=RequestMethod.POST)
	public String join(UserVO userVO) {
		log.debug("JOIN");
		log.debug(userVO.toString());
		userService.join(userVO);
		
		/*
		 * return "문자열" : Forwarding
		 * => views/문자열.jsp를 rendering 하라
		 * 
		 * return "redirect:/user" : pass, toss, redirect
		 * => 서버의 localhost:8080/url을 다시 request 하라
		 * => web browse 주소창에 localhost:8080/url을 입력하고
		 * 		Enter 를 누르는 것과 같은 효과
		 */
		return "redirect:/user/login";
	}
	/* 
	 * username 중복검사를 하기 위하여 보통 다음같은 요청을 수행한다
	 * /user/idcheck?username=lee.98
	 * 
	 * fetch(`${rootPath}/user/idcheck${username.value}`)
	 * 만약 username 에 lee.98 입력했으면
	 * /user/idcheck/lee.98 처럼 요청 URL 만들어서 요청을 수행하라
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/idcheck/{username:.+}",method=RequestMethod.GET)
	public String idcheck(@PathVariable String username) {
		
		UserVO userVO = userService.findById(username);
		/*
		 * if(userVO.getUsername().equalsIgnoreCase(username)){ return "FAIL"; } else {
		 * return "ok"; }
		 * 
		 * id를 email 주소로 사용할때 PathVarriable로 받을 경우
		 * dot(.) 이휴의 문자열을 잘라버리는 현상이 있다
		 * 이때는 정규식(Rexp) 를 사용하여 dot(.) 이후 문자열을 포함하여
		 * 변수에 저장하도록 변수를 수정
		 * 		{username:.+} 형식으로 지정한다
		 */
		if(userVO == null) {
			return "OK";
		}else {
			return "FAIL";
		}
	}
}
