package com.ducquylibrary.service;

import java.util.List;
import java.util.Optional;

import com.ducquylibrary.model.Course;

public interface CourseService {
	List<Course> findAllCourse();
	void saveCourse(Course course);
	Optional<Course> findCourseById(long id);
	void deleteCourse(Course course);
}
