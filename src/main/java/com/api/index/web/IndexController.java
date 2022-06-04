package com.api.index.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.api.common.commonVO;



@RestController
@RequestMapping("/api/todo")
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	
	@GetMapping(value = "/index")
	public ModelAndView home(HttpServletRequest req) {	
		ModelAndView modelAndView = new ModelAndView("jsonView");		
		
		modelAndView.setViewName("/index");
		return modelAndView;
	}
}