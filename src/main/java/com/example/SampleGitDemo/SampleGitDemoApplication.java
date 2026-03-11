package com.example.SampleGitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleGitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleGitDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello naveen hello from main";
	}
}
