package com.example.CoursesApiApp.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoursesRepository extends CrudRepository<Courses, String> {
    public List<Courses> findByTopicId(String topicId);
}
