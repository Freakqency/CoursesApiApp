package com.example.CoursesApiApp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping("topics")
    public List<Topic> getTopics() {
        return topicService.getAllTopics();
    }
    @GetMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void removeTopic(@PathVariable String id) {
        topicService.removeTopic(id);
    }
}
