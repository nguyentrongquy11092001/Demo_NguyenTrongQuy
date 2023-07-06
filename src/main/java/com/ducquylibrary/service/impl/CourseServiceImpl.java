package com.ducquylibrary.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ducquylibrary.model.Course;
import com.ducquylibrary.repository.CourseRepository;
import com.ducquylibrary.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> findAllCourse() {
		return courseRepository.findAll();
	}

	@Override
	public void saveCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public Optional<Course> findCourseById(long id) {
		return courseRepository.findById(id);
	}

	@Override
	public void deleteCourse(Course course) {
		courseRepository.delete(course);
	}

}
