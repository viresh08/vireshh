package course.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class helloService {
	
	private ArrayList<Topics> alTopics = new ArrayList<Topics>();
	
	/*@Autowired
	private TopicRepository repository;*/
	
	public helloService()
	{
		alTopics.add(new Topics("j","jj","jjj"));
		alTopics.add(new Topics("k","kk","kkk"));
	}
	
	public String sMethod()
	{
		return "Service";
	}
	
	public List<Topics> getAllTopics()
	{
		return alTopics;
		
		/*List<Topics> tpcs = new ArrayList<Topics>();
		repository.findAll();*/
		
	}
	
	public void updateTopic(Topics topic,String id)
	{
		for(int i=0;i<alTopics.size();i++)
		{
			Topics t = (Topics)alTopics.get(i);
			if(t.getId().equals(id))
			{
				alTopics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id)
	{
		for(int i=0;i<alTopics.size();i++)
		{
			Topics t = (Topics)alTopics.get(i);
			if(t.getId().equals(id))
			{
				alTopics.remove(i);
				return;
			}
			
		}
		
	/*public String addTopic(Topics tpcs)
	{
		repository.save(tpcs);
	}*/
	

}
}