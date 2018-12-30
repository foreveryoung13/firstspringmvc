package com.nanafebriana.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("greet")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView hello() {
		ModelAndView m = new ModelAndView("HelloPage");
		m.addObject("msg", "Hello World !");

		return m;
	}

	@RequestMapping("/hi/{name}")
	public ModelAndView hi(@PathVariable("name") String name) {
		ModelAndView m = new ModelAndView("HelloPage");
		m.addObject("msg", "Hi " + name + " !");

		return m;
	}

	@RequestMapping("/hi/{name}/{country}")
	public ModelAndView pathvariable(@PathVariable Map<String, String> path) {
		ModelAndView m = new ModelAndView("HelloPage");

		String name = path.get("name");
		String country = path.get("country");

		m.addObject("msg", "my name: " + name + " and country : " + country);

		return m;
	}

}
