package conttroller.Background;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Developer {	
	
	@RequestMapping("/dev/login")
	public String Page(){
		System.out.println("≤‚ ‘!");
		return "devlogin";
	}
}
