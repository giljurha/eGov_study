package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/goods")
public class GoodsController {
	@RequestMapping("/allcategories")
	public String allcategories() {
		log.info("실행");
		return "goods/allcategories";
	}
	@RequestMapping("/category1")
	public String category1() {
		log.info("실행");
		return "goods/category1";
	}
	@RequestMapping("/category2")
	public String category2() {
		log.info("실행");
		return "goods/category2";
	}
	@RequestMapping("/category3")
	public String category3() {
		log.info("실행");
		return "goods/category3";
	}
	@RequestMapping("/category4")
	public String category4() {
		log.info("실행");
		return "goods/category4";
	}
	@RequestMapping("/goodsDetail")
	public String goodsDetail() {
		log.info("실행");
		return "goods/goodsDetail";
	}

}
