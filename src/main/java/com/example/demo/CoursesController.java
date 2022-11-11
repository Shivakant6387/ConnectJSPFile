package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CoursesController {
	@GetMapping("/course")
	public String courses() {
		System.out.println("Welcome to edureka");	
		return "course";
	}
}
