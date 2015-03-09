package com.breeze.sfd.web;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/movie")
public class DefaultController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		try {
			name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		model.addAttribute("movie", name);
		return "movie";
 
	}
 
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
 
		model.addAttribute("movie", "默认：江山仍在英雄无踪");
		return "movie";
 
	}
}
