package com.devopssample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class FrontController{
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getHomeView(HttpServletRequest request) {
		StringBuilder str=new StringBuilder("test");
		str.append("string");

		if(!str.toString().isEmpty()){
			System.out.println(str.toString());
		}
		ModelAndView model = new ModelAndView("home");
		return model;
	}

}