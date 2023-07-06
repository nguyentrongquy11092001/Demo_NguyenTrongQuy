package com.ducquylibrary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ducquylibrary.model.Course;
import com.ducquylibrary.repository.CourseRepository;

@SpringBootApplication(exclude = DataSourceTransactionManagerAutoConfiguration.class)
public class KttkpmNguyenTrongQuyApplication implements CommandLineRunner{
	@Autowired
	private CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(KttkpmNguyenTrongQuyApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Course> courses = courseRepository.findAll();
		courses.forEach(System.out :: println);
	}
	
}
