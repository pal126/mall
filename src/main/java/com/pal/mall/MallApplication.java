package com.pal.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MallApplication {

	@RequestMapping("/")
	public String index(){
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
	}
}
