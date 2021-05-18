
package boot.practice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	
	static {
		
	System.out.println("class loaded");
	}
	
	@GetMapping(path = "/hello")
	public String sayHello() {
		return "Hello der";

	}

	@PostMapping(path = "/hello")
	public String sayHello(@RequestBody String name) {
		return "Hello der" + name;

	}
}
