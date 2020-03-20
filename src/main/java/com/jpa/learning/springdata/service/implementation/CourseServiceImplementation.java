package com.jpa.learning.springdata.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.learning.springdata.model.Course;
import com.jpa.learning.springdata.model.Reviews;
import com.jpa.learning.springdata.repository.CourseRepository;
import com.jpa.learning.springdata.repository.CourseSpringDataRepository;
import com.jpa.learning.springdata.resourceObject.CourseRequest;
import com.jpa.learning.springdata.resourceObject.CourseResponse;
import com.jpa.learning.springdata.service.CourseService;

@Service
public class CourseServiceImplementation implements CourseService {

	@Autowired
	CourseRepository repository;
	
	@Autowired
	CourseSpringDataRepository jpaRepo;

	@Override
	@Transactional
	public List<CourseResponse> getAllCourseDetails() {
		return repository.getAllCourses();
	}

	@Override
	public CourseResponse addorUpdateCourse(CourseRequest request) {
		return repository.addorUpdateCourse(request);
	}

	@Override
	public String deleteCourse(Long courseId) {
		return repository.deleteCourse(courseId);
	}

	@Override
	public Course getOneCourse(Long id) {
		Optional<Course> course = jpaRepo.findById(id);
		//List<Reviews> reviews = course.get().getReviews();
		return course.get();
	}

}
