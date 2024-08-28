package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/mypage")
public class MyPageController {
	@RequestMapping("/changeinfo")
	public String changeinfo() {
		log.info("실행");
		return "/mypage/changeinfo";
	}
}
