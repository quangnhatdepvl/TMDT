package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Course;
import com.example.repository.CourseRepository;


@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourse() {
		return (List<Course>) courseRepository.findAll();
	}

	@Override
	public Optional<Course> findCourseById(String id) {
		return courseRepository.findById(id);
	}

}
