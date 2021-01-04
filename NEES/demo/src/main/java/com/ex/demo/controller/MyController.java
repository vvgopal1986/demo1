package com.ex.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.demo.error.StudentNotFoundException;
import com.ex.demo.model.Student;
import com.ex.demo.service.StudentService;

@RestController
@CrossOrigin
public class MyController {
	@Autowired
	private StudentService service;

	@PostMapping("/welcome")
public ResponseEntity<Student> create(@Validated @RequestBody Student st) throws StudentNotFoundException {
 
st=service.save(st);
if(st==null) {
 }
	return new ResponseEntity<>(st,HttpStatus.OK);
}

}
