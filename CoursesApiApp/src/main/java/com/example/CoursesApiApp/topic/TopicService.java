package com.example.CoursesApiApp.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("Spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "Javascript", "Javascript Description"),
                new Topic("python", "Python", "Python Description"),
                new Topic("cpp", "CPP", "CPP Description")
    ));
    public List<Topic> getAllTopics() {return topics;}

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.id().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).id().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void removeTopic(String id) {
        topics.removeIf(topic -> topic.id().equals(id));
    }
}
