package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping("/answerlist")
	public String answerlist() {
		log.info("실행");
		return "admin/answerlist";
	}
	@RequestMapping("/faq")
	public String faq() {
		log.info("실행");
		return "admin/faq";
	}
	@RequestMapping("/manageproduct")
	public String manageproduct() {
		log.info("실행");
		return "admin/manageproduct";
	}
	@RequestMapping("/notice")
	public String notice() {
		log.info("실행");
		return "admin/notice";
	}

}
