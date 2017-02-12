package course.api;
/*
import javax.persistence.Entity;
import javax.persistence.Id;*/


public class Topics {
	
	
	public Topics()
	{
		
	}
	
	public Topics(String id,String name,String description)
	{
		this.id = id;
		this.descripion = description;
		this.name = name;
		
	}

	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescripion() {
		return descripion;
	}
	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}
	private String name;
	private String descripion;

}
