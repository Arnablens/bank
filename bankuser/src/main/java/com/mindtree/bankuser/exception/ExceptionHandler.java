package com.mindtree.bankuser.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandler {
	@Value("${spring.application.name}")
	private String applicationName;
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ModelAndView exceptionHandler(HttpServletRequest req,Exception e){
		ModelAndView mv=new ModelAndView();
		mv.addObject("status", HttpStatus.NOT_FOUND.value());
		mv.addObject("ErrorMessage", e.getMessage());
        mv.addObject("TimeStamp", new Date());
        mv.addObject("Application_Name", applicationName);
        mv.setViewName("error");
		return mv;
	}
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ModelAndView exceptionHandler(HttpServletRequest req,ControllerServiceException e){
		ModelAndView mv=new ModelAndView();
		mv.addObject("status", HttpStatus.NOT_FOUND.value());
		mv.addObject("ErrorMessage", e.getMessage());
        mv.addObject("TimeStamp", new Date());
        mv.addObject("Application_Name", applicationName);
        mv.setViewName("error");
		return mv;
	}

}
