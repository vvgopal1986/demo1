package com.ex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ex.demo.logging.MyLogger;

@SpringBootApplication
 public class DemoApplication {

private static MyLogger mylogger=new MyLogger();
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	 
	}

}
