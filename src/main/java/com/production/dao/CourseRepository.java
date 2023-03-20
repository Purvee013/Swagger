package com.production.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.production.modal.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{

}
