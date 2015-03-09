package com.breeze.sfd.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class MovieController {
 
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
 
		return "index";
 
	}
}
