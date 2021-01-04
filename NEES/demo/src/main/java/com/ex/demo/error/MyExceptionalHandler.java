package com.ex.demo.error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ex.demo.model.Student;

@ControllerAdvice
public class MyExceptionalHandler {
	@Autowired
	private Student st;
	@ExceptionHandler(StudentNotFoundException.class)
	@ResponseBody
	public ResponseEntity<?> stNotFound(StudentNotFoundException stnf){
		ErrorType err=new ErrorType(0,"FAILED");
		
		 return new ResponseEntity<ErrorType>(err,HttpStatus.OK);
		
		
	}

}
