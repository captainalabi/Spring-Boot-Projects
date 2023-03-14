package com.collabo.firstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	//get http method
	//http://localhost:8081/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		
		return "Hello World Good morning";
	}
	
}
