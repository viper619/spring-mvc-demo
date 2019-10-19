package com.viper.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viper.springdemo.mvc.modal.Student;

/**
 * @author Viper's Predator
 *
 */
@Controller
@RequestMapping("/student")
public class StudentController
{
	@RequestMapping({"/showform",""})
	public String showForm(Model model)
	{
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute Student student)
	{
		return "student-confirmation";
	}
}

