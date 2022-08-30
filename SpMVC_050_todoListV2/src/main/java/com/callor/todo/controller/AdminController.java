package com.callor.todo.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.todo.model.UserVO;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	@PreAuthorize("hasAnyRole(['ROLE_USER','ROLE_ADMIN'])")
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(@AuthenticationPrincipal UserVO userVO,  Principal principal) {
		String username = principal.getName();
		// /WEB-INF/views/admin/home.jsp
		return null;
	}
	
}
