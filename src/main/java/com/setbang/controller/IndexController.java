package com.setbang.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	// 메인 페이지 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.info("Setbang으로 이동합니다", locale);
		
		return "index";
	}
	
	// 구로점 안내 실행
	@RequestMapping(value = "branchGuro.do", method = RequestMethod.GET)
	public String branchGuro(Locale locale, Model model) {
		
		return "/branch/branchGuro";
	}
	
	// 강남점 안내 실행
	@RequestMapping(value = "branchGangnam.do", method = RequestMethod.GET)
	public String branchGangnam(Locale locale, Model model) {
		
		return "/branch/branchGangnam";
	}
	
	// 판교점 안내 실행
	@RequestMapping(value = "branchPangyo.do", method = RequestMethod.GET)
	public String branchPangyo(Locale locale, Model model) {
		
		return "/branch/branchPangyo";
	}

}
