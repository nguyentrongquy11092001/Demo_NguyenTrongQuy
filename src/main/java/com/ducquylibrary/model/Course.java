package com.ducquylibrary.model;

import javax.persistence.*;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCourse;
	
	private String courseName;
	
	private String courseCaption;
	
	private String coursePrice;
	
	private String courseDiscount;
	
	private String courseCreator;
	//

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName, String courseCaption, String coursePrice, String courseDiscount,
			String courseCreator) {
		super();
		this.courseName = courseName;
		this.courseCaption = courseCaption;
		this.coursePrice = coursePrice;
		this.courseDiscount = courseDiscount;
		this.courseCreator = courseCreator;
	}
	//

	public long getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(long idCourse) {
		this.idCourse = idCourse;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCaption() {
		return courseCaption;
	}

	public void setCourseCaption(String courseCaption) {
		this.courseCaption = courseCaption;
	}

	public String getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(String coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getCourseDiscount() {
		return courseDiscount;
	}

	public void setCourseDiscount(String courseDiscount) {
		this.courseDiscount = courseDiscount;
	}

	public String getCourseCreator() {
		return courseCreator;
	}

	public void setCourseCreator(String courseCreator) {
		this.courseCreator = courseCreator;
	}
	//

	@Override
	public String toString() {
		return "Course [idCourse=" + idCourse + ", courseName=" + courseName + ", courseCaption="
				+ courseCaption + ", coursePrice=" + coursePrice + ", courseDiscount=" + courseDiscount
				+ ", courseCreator=" + courseCreator + "]";
	}
	
}
