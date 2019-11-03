package com.imooc.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author youyu.song
 * @date 2019/6/30 15:22
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

	@ModelAttribute("acceptLanguage")
	public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage){
		return acceptLanguage;
	}

	@ModelAttribute("jsessionId")
	public String jsessionId(@CookieValue("JSESSIONID") String jsessionId){
		return jsessionId;
	}

	@ModelAttribute("message")
	public String message(){
		return "Hello,World";
	}

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> onException(Throwable throwable) {
		return ResponseEntity.ok(throwable.getMessage());
	}

}
