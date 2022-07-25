package com.callor.score.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	  @RequestMapping(value={"JSON"},method=RequestMethod.GET) 
	  //학생리스트를 return 하기 위해 return type List<StudnetVO> 
	  public List<StudentVO> student(Model model) {
	  
	  List<StudentVO> student = stService.selectAll();
	  
	  return student; 
	  }
	 
	@RequestMapping(value={"","/"},method=RequestMethod.GET)
	public String home(Model model) {
		
		List <StudentVO> student = stService.selectAll();
		model.addAttribute("STUDENTS",student);
		
		return "student/list";
	}
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public String detail(@RequestParam("st_num") String st_num,Model model) {
		StudentVO student=stService.findById(st_num);
		model.addAttribute("STUDENT",student);
		return "student/detail";
	}
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(@RequestParam(name="st_num", required= false, defaultValue="0") String st_num, Model model) {
		StudentVO studnet =stService.findById(st_num);
		model.addAttribute("STUDENT",studnet);
		return"student/update";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@RequestParam("st_num") String st_num,StudentVO StVO) {
		StVO.setSt_name(st_num);
		stService.update(StVO);
		return"redirect:student/detail";
	}
	
}
