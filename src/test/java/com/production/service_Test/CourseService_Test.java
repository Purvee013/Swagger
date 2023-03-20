package com.production.service_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.production.dao.CourseRepository;
import com.production.modal.Course;
import com.production.service.CourseService;

@SpringBootTest(classes= {CourseService_Test.class})
public class CourseService_Test {
@Mock
CourseRepository repo;//mocking repo
@InjectMocks
CourseService service; //

@Test
public void saveCourse_test() {
Course my_data=new Course(1,"Hindi",987);

when(repo.save(any(Course.class))).thenReturn(my_data);
String s="Saved course with id";
assertEquals(s+1, service.saveCourse(my_data));
//assertEquals(s+1, s+my_data.getCourseId());
}
@Test
public void getAllCourses_test() {
	List<Course> my_data=new ArrayList<Course>();
	my_data.add(new Course(1,"Hindi",987));
	
	when(repo.findAll()).thenReturn(my_data);
	
	assertEquals(1, service.getAllCourses().size());
}
@Test
public void  deleteCourseById_test() {
	
	
service.deleteCourseById(1);
verify(repo,times(1)).deleteById(1);
List<Course> my_data=new ArrayList<Course>();
my_data.add(new Course(1,"Hindi",987));

when(repo.findAll()).thenReturn(my_data);

assertEquals(1, service.getAllCourses().size());


}
}



