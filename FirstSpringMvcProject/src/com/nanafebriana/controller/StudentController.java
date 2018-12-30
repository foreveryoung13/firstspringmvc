package com.nanafebriana.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nanafebriana.customeditor.StudentNameEditor;
import com.nanafebriana.model.Student;

@Controller
@RequestMapping("student")
public class StudentController {

	@RequestMapping("/")
	public String index(Model model) {
		return "studentform";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "studentMobile" });
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
	}

	@ModelAttribute
	public void header(Model model) {
		model.addAttribute("headermesage", "Hello your fucking asshole. ");
	}

	@RequestMapping(value = "/studentform", method = RequestMethod.GET)
	public ModelAndView addmissionForm() {
		ModelAndView m = new ModelAndView("StudentPage");
		return m;
	}

	@RequestMapping(value = "/studentsubmit", method = RequestMethod.POST)
	public ModelAndView addmissionSubmit(@Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult) {

		System.out.println("Name " + student.getName());
		System.out.println("Address " + student.getAddress());
		System.out.println("Mobile " + student.getStudentMobile());
		System.out.println("DOB" + student.getStudentDOB());
		System.out.println("Skills " + student.getStudentSkills());
		System.out.println("Country  " + student.getStudentAddress().getCountry());
		System.out.println("City  " + student.getStudentAddress().getCity());
		System.out.println("Street  " + student.getStudentAddress().getStreet());
		System.out.println("pincode  " + student.getStudentAddress().getPincode());

		if (bindingResult.hasErrors()) {
			ModelAndView vm = new ModelAndView("StudentPage");
			return vm;
		}

		ModelAndView m = new ModelAndView("StudentSubmitPage");
		m.addObject("student", student);

		return m;
	}

}
