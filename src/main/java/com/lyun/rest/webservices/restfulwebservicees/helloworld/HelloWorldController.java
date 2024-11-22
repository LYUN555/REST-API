package com.lyun.rest.webservices.restfulwebservicees.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld(){
		
		return "Hello World";
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
		
		return new HelloWorldBean("Hello World, "+ name);
	}
}