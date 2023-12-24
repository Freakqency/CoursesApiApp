package com.example.CoursesApiApp.courses;

import com.example.CoursesApiApp.topic.Topic;
import com.example.CoursesApiApp.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    private CoursesService coursesService;
    @Autowired
    private TopicRepository topicRepository;
    @Autowired
    private CoursesRepository coursesRepository;
    @GetMapping("topics/{topicId}/courses")
    public List<Courses> getAllCourses(@PathVariable String topicId) {
        return coursesService.getAllCourses(topicId);
    }
    @GetMapping("topics/{topicId}/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId) {
        return coursesService.getCourse(courseId);
    }
    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Courses courses, @PathVariable String topicId) {
        topicRepository.findById(topicId).map(topic -> {
            courses.setTopic(topic);
            return coursesRepository.save(courses);
        }).orElseThrow();
    }
    @PutMapping("/topics/{topicId}/courses/{courseId}")
    public void updateCourse(@RequestBody Courses courses, @PathVariable String topicId) {
        topicRepository.findById(topicId).map(topic -> {
            courses.setTopic(topic);;
            return coursesRepository.save(courses);
        }).orElseThrow();
    }
    @DeleteMapping("/topics/{topicId}/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId) {
        coursesService.deleteCourse(courseId);
    }
}
