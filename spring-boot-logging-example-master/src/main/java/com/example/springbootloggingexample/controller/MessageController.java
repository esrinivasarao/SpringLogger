package com.example.springbootloggingexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/message")
	public String getMessage() {
		logger.info("[getMessage] - new  info message");
		logger.warn("[getMessage] - new warn message");
		logger.error("[getMessage] - new error message");
		logger.debug("[getMessage] - new debug message");
		logger.trace("[getMessage] -new trace message");
		
		System.out.println(10/0);
		return "open console to check log messages.";
	}
}
