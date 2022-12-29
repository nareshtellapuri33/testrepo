package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//get http method
@GetMapping	("/hello")
public String helloworld() {
	
	return "Learn java and spring boot";
}
	
	
}
