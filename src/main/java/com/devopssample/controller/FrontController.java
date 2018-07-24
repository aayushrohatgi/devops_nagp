package com.devopssample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
*
* class
*/
@Controller
@RequestMapping(value = "/")
public class FrontController{

	/*
	 *
	 * method
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getHomeView(HttpServletRequest request) {
		int a=10,c=5;
		c = a+c;
		return new ModelAndView("home");
	}

}
