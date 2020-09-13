package com.db.micro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Vaman Deshmukh 
 *
 */

@RestController
public class DbController {

	@RequestMapping("/db")
	public String db() {
		String message = "Welcome to DB!";
		System.out.println(message);
		return message;
	}

}
