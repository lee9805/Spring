package com.callor.score.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

@Controller
@RequestMapping(value="/student")
public class StudentController {

	@Autowired
	private StudentService stService;
	
	//JSON type 으로 return
	@ResponseBody
	@RequestMapping(value={"/",""},method=RequestMethod.GET)
	//학생리스트를 return 하기 위해 return type List<StudnetVO>
	public List<StudentVO> student(Model model) {
		
		List<StudentVO> student = stService.selectAll();
		
		return student;
	}
	
}
