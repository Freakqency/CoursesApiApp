package com.example.CoursesApiApp.courses;

import com.example.CoursesApiApp.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CoursesController {
    @Autowired
    private CoursesService coursesService;
    @GetMapping("topics/{topicId}/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId) {
        return coursesService.getCourse(courseId);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Courses courses) {
        coursesService.addCourse(courses);
    }
}
