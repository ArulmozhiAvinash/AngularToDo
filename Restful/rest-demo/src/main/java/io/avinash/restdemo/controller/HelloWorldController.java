package io.avinash.restdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.avinash.restdemo.model.HelloWorldBean;
@CrossOrigin
@RestController
public class HelloWorldController {

	@GetMapping(path="/")
	public HelloWorldBean getHelloWorld() {
		HelloWorldBean hello = new HelloWorldBean();
		hello.setMessage("Helloworld");
		return hello;
	}
	
	@GetMapping(path="/{name}/{value2}")
	public HelloWorldBean getHelloWorldWithParam(@PathVariable String name,@PathVariable String value2) {
		HelloWorldBean hello = new HelloWorldBean();
		hello.setMessage(name+value2);
		return hello;
	}
}
