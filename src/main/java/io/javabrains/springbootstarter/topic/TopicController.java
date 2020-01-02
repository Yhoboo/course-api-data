package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    //Retruning Objects from Controller : youtube.com/javabrains: spring boot quick start 13
//    @RequestMapping("/topics")
//    public List<Topic> getAllTopics(){
//        return Arrays.asList(
//                new Topic("Spring", "Spring Framework", "Spring Framework Description"),
//                new Topic("Java", "Core Java", "Core Java Description"),
//                new Topic("Javascript", "Javascript", "Javascript Description"),
//                new Topic("C++","C++","C++ Description")
//        );
//    }

    // 01/01/2020|17 : lanjut materi ke 17
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    // 01/01/2020|18 : getting a single resource of list topics
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    // 01/01/2020|19 : add POST request
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    // 01/01/2020|20 : add Update request
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    // 01/01/2020|20 : add Delete request
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
