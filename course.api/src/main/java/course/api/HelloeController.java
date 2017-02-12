package course.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloeController {
	
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}

}
