package CONTROLLER;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import POJO.Topics;
import SERVICES.TopicServices;

@RestController
public class TopicController {
	
	@Autowired
	private TopicServices tService;
	
	@RequestMapping(method =RequestMethod.POST,value="/addTopic")
	public void addTopic(@RequestBody Topics topic)
	{
		tService.addTopic(topic);
	}
	
	@RequestMapping("/topics")
	public ArrayList<Topics> retrieveTopics()
	{
		
		return tService.retrieveTopics();
	}
	

}
