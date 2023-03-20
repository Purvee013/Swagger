package com.production.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.production.dao.CourseRepository;
import com.production.modal.Course;

import jakarta.persistence.Id;

@Service
public class CourseService {
	@Autowired
	private CourseRepository repo;
	
public String saveCourse(Course course) {
	repo.save(course);
	return "Saved course with id"+course.getCourseId();
}
public List<Course> getAllCourses(){
	return repo.findAll();
}
public List<Course> deleteCourseById(int courseId){
	repo.deleteById(courseId);
	return repo.findAll();
}
}
