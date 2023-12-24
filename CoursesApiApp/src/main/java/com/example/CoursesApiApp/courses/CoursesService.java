package com.example.CoursesApiApp.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;
    public Courses getCourse(String courseId) {
        return coursesRepository.findById(courseId).get();
    }
    public void addCourse(Courses courses) {
        coursesRepository.save(courses);
    }
}
