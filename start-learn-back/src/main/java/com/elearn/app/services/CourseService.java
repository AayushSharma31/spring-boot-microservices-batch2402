package com.elearn.app.services;

import com.elearn.app.dtos.CourseDto;
import com.elearn.app.entities.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CourseService {
    CourseDto createCourse(CourseDto courseDto);

    CourseDto updateCourse(String id, CourseDto courseDto);

    CourseDto getCourseById(String id);

    Page<CourseDto> getAllCourses(Pageable pageable);

    void deleteCourse(String id);

    List<CourseDto> searchCourses(String keyword);

//    CourseDto create(CourseDto courseDto);
//
//    List<CourseDto> getAll();
//
//    CourseDto update(CourseDto dto, String courseId);
//
//    void delete(String courseId);
//
//    List<CourseDto> searchByTitle(String titleKeyword);


}
