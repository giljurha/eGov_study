package com.mycompany.miniproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@RequestMapping("/login")
	public String login() {
		log.info("");
		return "/user/login";
	}
	
	@RequestMapping("signup")
	public String signup() {
		log.info("");
		return "/user/signup";
	}
	
	@RequestMapping("/searchIdByEmail")
	public String searchIdByEmail() {
		log.info("");
		return "/user/searchIdByEmail";
	}
	
	@RequestMapping("/searchIdByPhone")
	public String searchIdByPhone() {
		log.info("");
		return "/user/searchIdByPhone";
	}
	
	@RequestMapping("/searchPasswordByEmail")
	public String searchPasswordByEmail() {
		log.info("");
		return "/user/searchPasswordByEmail";
	}
	
	@RequestMapping("/searchPasswordByPhone")
	public String searchPasswordByPhone() {
		log.info("");
		return "/user/searchPasswordByPhone";
	}
}
