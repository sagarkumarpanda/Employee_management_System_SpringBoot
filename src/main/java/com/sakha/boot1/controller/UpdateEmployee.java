package com.sakha.boot1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sakha.boot1.model.Employee;
import com.sakha.boot1.service.EmployeeService;


@Controller
public class UpdateEmployee {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/update")
	public String update(@ModelAttribute("emp") Employee emp,Model m){    
		empService.update(emp);    
        m.addAttribute("emp","update sucessfully...");
        return "success";    
    }    
}


