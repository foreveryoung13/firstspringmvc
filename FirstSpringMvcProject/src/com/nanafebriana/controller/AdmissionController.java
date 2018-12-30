package com.nanafebriana.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("form")
public class AdmissionController {

	@RequestMapping(value = "/addmissionform", method = RequestMethod.GET)
	public ModelAndView addmissionForm() {
		ModelAndView m = new ModelAndView("AdmissionPage");
		return m;
	}

	@RequestMapping(value = "/addmissionsubmit", method = RequestMethod.POST)
	public ModelAndView addmissionSubmit(@RequestParam Map<String, String> path) {
		ModelAndView m = new ModelAndView("AdmissionSubmitPage");

		String name = path.get("name");
		String address = path.get("address");

		m.addObject("name", name);
		m.addObject("address", address);

		return m;
	}

}
