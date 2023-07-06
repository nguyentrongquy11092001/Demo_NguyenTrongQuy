package com.ducquylibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ducquylibrary.model.Course;
import com.ducquylibrary.service.CourseService;

@Controller
@RequestMapping("/courses")
public class MainController {
	@Autowired
	private CourseService courseService;

	public MainController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	@GetMapping({"","/listCourse"})
	public ModelAndView findAllCourses() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("courses", courseService.findAllCourse());
		modelAndView.setViewName("listCourse");
        return modelAndView;
	}	

	@GetMapping("/showAddCourse")
    public ModelAndView showAddCourse() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("course", new Course());
        modelAndView.setViewName("addCourse");
        return modelAndView;
    }
	
	@PostMapping("/saveCourse")
    public ModelAndView saveCourse(@ModelAttribute Course course) {
        ModelAndView modelAndView = new ModelAndView();
        courseService.saveCourse(course);
        modelAndView.setViewName("redirect:/courses");
        return modelAndView;
    }
}
