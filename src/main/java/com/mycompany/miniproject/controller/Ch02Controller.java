package com.mycompany.miniproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.miniproject.dto.Ch02LoginResult;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/ch02")
public class Ch02Controller {
	
	@RequestMapping("/getMethod")
	public String getMethod(Model model) {
		log.info("실행");
		model.addAttribute("chNum", "ch02");
		return "ch02/getMethod";
	}
	//@RequestMapping(value="/getAtag", method=RequestMethod.GET)
	@GetMapping("/getAtag")
	public String getAtag(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/getMethod";
	}
	
	@GetMapping("/getFormTag")
	public String getFormTag(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "redirect:/";
	}
	
	@GetMapping("/getLocationHref")
	public String getLocationHref(String bno, String bkind) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		return "ch02/getMethod";
	}
	
	@GetMapping("/getAjax1")
	public String getAjax1(String bno, String bkind) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		return "ch02/ajaxFragmentHtml";
	}
	
	@GetMapping("/getAjax2")
	public String getAjax2(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/ajaxJSON";
	}
	
	@GetMapping("/postMethod")
	public String postMethod(Model model) {
		log.info("실행");
		model.addAttribute("chNum", "ch02");
		return "ch02/postMethod";
	}
	
	@PostMapping("/postFormTag")
	public String postFormTag(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "redirect:/";
	}
	
	@PostMapping("/postAjax1")
	public String postAjax1(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/ajaxFragmentHtml";
	}
	
	@PostMapping("/postAjax2")
	public String postAjax2(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/ajaxJSON";
	}
	
	@GetMapping("/returnModelAndView")
	public ModelAndView returnModelAndView() {
		log.info("실행");
		ModelAndView mav = new ModelAndView();
		mav.addObject("bno", 15);
		mav.addObject("bkind", "notice");
		mav.addObject("mid", "user1");
		mav.addObject("email", "user1@gmail");
		mav.addObject("chNum", "ch02");
		mav.setViewName("ch02/returnModelAndView");
		return mav;
	}
	
	@GetMapping("/returnVoid")
	public void returnVoid(HttpServletResponse response) throws IOException {
		log.info("실행");
		// { } : 객체	JSONObject jsonObject = new JSONObject();
		// [ ] : 배열 JSONArray jsonArray new JSONArray();
		
		// { "result": "success", "mid: "user1" }
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", "success");
		jsonObject.put("mid", "user1");
		String json = jsonObject.toString();
		
		// 응답 생성(헤더 ( contentType) + 본문 (데이터) )
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.flush();
		pw.close();
	}
	
	@GetMapping(value="/returnObject", produces="application/json; charset=UTF-8")
	@ResponseBody
	public Ch02LoginResult returnObject() {
		log.info("실행");

		Ch02LoginResult obj = new Ch02LoginResult();
		obj.setResult("success");
		obj.setMid("user1");
		
		return obj;
	}
	
//	@LoginCheck
	@GetMapping("/mypage")
	public String mypage(Model model) {
		log.info("실행");
		model.addAttribute("chNum", "ch02");
		return "ch02/mypage";
	}
	
	@GetMapping("/loginForm")
	public String loginForm(Model model) {
		model.addAttribute("chNum", "ch02");
		return "ch02/loginForm";
	}
	
	@PostMapping("/login")
	public String login(String mid, String mpassword, HttpSession session) {
		log.info("실행");
		log.info("mid: " + mid);
		log.info("mpassword: " + mpassword);


		session.setAttribute("login", mid);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		log.info("실행");
	
		session.removeAttribute("login");
		return "redirect:/ch02/loginForm";
	}
	
	
}
