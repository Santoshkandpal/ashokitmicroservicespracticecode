package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping(value="user/{userId}")
	public String getName(@PathVariable Integer userId) {
		if(userId==100) {
			return "raju";
		}
		else if(userId==101) {
			return "rani";
		}
		else {
			return "User not found";
		}
		
		
	}

}
