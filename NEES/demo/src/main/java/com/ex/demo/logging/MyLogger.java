package com.ex.demo.logging;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Aspect
@EnableAspectJAutoProxy
 public class MyLogger {
 public static Logger logger = Logger.getLogger(MyLogger.class);
@Before("execution(* public ResponseEntity<Student> create(..))")
	public void log(JoinPoint pc) {
		logger.info("Application Started");
		System.out.println("Beginning execution for "+pc.getSignature().getName());
	}
@AfterReturning( "execution(* public ResponseEntity<Student> create(..))")
	public void logError() {
		logger.error("Error Occured Please Check the credentials");
	}

}
