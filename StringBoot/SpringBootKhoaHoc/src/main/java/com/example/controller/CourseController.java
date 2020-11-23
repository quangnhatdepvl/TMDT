package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/")
	public String index(Model mav) {
		mav.addAttribute("courses", courseService.getAllCourse());
		System.out.println(courseService.getAllCourse());
		return "courses";
	}

	@GetMapping("/courses")
	public String courses() {
		return "index";
	}

}
