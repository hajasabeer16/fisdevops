package com.example.demo.microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@SpringBootApplication
public class Microservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
	}
	@Autowired
	RestTemplate template;
	@GetMapping("/test3")
	public String test3() {
		return "Iam from test 3 " ;
	}
	@GetMapping("/test4")
	public String test4()
	{
		return "Iam from test 4 " ;
	}
	@GetMapping("/getmicrodata1")
	public String getmicrodata() {
		String result = template.getForObject("http://localhost:8888/test1",String.class) ;
		return result;
	
	}
	@Bean
	public RestTemplate resttemplate() {

		return new RestTemplate() ;
	}	

}

