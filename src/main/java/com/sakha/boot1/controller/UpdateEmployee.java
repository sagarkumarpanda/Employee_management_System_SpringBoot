package com.sakha.boot1.controller;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakha.boot1.model.Employee;
import com.sakha.boot1.service.EmployeeService;


@Controller
public class UpdateEmployee {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/UpdateEmployee")
	public String update(@ModelAttribute Employee emp,Model m)
	{
		empService.UpdateEmployee(emp);
		m.addAttribute("emp","Update Sucessful");
		return "view";
	}
	    
}


