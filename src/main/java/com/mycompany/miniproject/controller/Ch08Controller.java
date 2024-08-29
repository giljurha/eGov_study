package com.mycompany.miniproject.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.miniproject.dto.Ch04LoginForm;
import com.mycompany.miniproject.dto.Ch04LoginFormValidator;
import com.mycompany.miniproject.dto.Ch06Cart;
import com.mycompany.miniproject.dto.Ch06Item;
import com.mycompany.miniproject.dto.Ch06Member;
import com.mycompany.miniproject.dto.Ch08LoginForm;
import com.mycompany.miniproject.dto.Ch08Member;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/ch08")
public class Ch08Controller {
	@GetMapping("/login")
	public String loginForm() {
		return "ch08/loginForm";
	}
	
	@PostMapping("/login")
	public String login(Ch08LoginForm loginForm, HttpSession session, Model model) {
		Ch08Member member = new Ch08Member();
		member.setMid(loginForm.getMid());
		member.setMpassword(loginForm.getMpassword());
		member.setMname("홍길동");
		member.setMemail("hong@mycompany.com");
		
		session.setAttribute("login", member);
		
		model.addAttribute("chNum","ch08");
		
		return "redirect:/";
	}
	
	@GetMapping("/loginInfo")
	public String loginInfo(Model model) {
		model.addAttribute("chNum", "ch08");
		return "ch08/loginInfo";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, Model model) {
		//session.removeAttribute("login"); 키값만 지우고
		session.invalidate(); // 모든 데이터를 다 지운다
		model.addAttribute("chNum", "ch08");
		return "redirect:/ch08/login";
	}
}
