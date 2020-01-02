package io.javabrains.springbootstarter.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    //17
    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    //18
    public Topic getTopic(String id){
        return topicRepository.findById(id).get();
    }

    //19
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    //20
    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }

    //20
    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }
}
