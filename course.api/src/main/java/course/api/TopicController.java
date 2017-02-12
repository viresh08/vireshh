package course.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private helloService hello;
	
	
	@RequestMapping("/topics")
	public List<Topics> allTpics()
	{
		return Arrays.asList(
				new Topics("Spring","Spring Framework","Spring Description"),
				new Topics("Java","Java Framework","Java Descripion"),
				new Topics("Core Java","Core Java Framework","Core Java Description")
				);
	}
	
	@RequestMapping("/rest")
	public String ret()
	{
		return hello.sMethod();
	}
	
	@RequestMapping("/newtopics")
	public List<Topics> fetch()
	{
		return hello.getAllTopics();
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/update/{id}")
	public void update(@RequestBody Topics topic,@PathVariable String id)
	{
		hello.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void delete(@PathVariable String id)
	{
		hello.deleteTopic(id);
	}

}
