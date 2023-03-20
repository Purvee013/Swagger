package com.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.production.modal.Course;
import com.production.service.CourseService;

@RestController
public class CourseController {
@Autowired
private CourseService service;
@PostMapping("/save")
public String saving(@RequestBody Course c) {
	return service.saveCourse(c);
}
@GetMapping("/allCourse")
public List<Course> allCourse() {
	return service.getAllCourses();
}
@DeleteMapping("/delete/{courseId}")
public List<Course> delete(@PathVariable int courseId) {
	return service.deleteCourseById(courseId);
	
}
}
