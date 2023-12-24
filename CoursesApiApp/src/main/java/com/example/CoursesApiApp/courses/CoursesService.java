package com.example.CoursesApiApp.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;
    public List<Courses> getAllCourses(String topicId) {
        return new ArrayList<>(coursesRepository.findByTopicId(topicId));
    }
    public Courses getCourse(String courseId) {
        return coursesRepository.findById(courseId).get();
    }
    public void addCourse(Courses courses) {
        coursesRepository.save(courses);
    }
    public void updateCourse(Courses courses) {
        coursesRepository.save(courses);
    }
    public void deleteCourse(String courseId) {
        coursesRepository.deleteById(courseId);
    }
}
