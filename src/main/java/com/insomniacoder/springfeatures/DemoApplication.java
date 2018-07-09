package com.insomniacoder.springfeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
@RestController
class DemoController{

	@GetMapping
	@ResponseStatus(code= HttpStatus.OK)
	public String requestParamExample(@RequestParam(value="name",required=false,defaultValue="Por")String name){
		return "Hello " + name;
	}

	@GetMapping("path/{name}")
	@ResponseStatus(code= HttpStatus.OK)
	public String pathVariableExample(@PathVariable String name){
		return "Hello " + name;
	}
}