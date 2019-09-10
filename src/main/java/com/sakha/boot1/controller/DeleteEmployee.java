package com.sakha.boot1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakha.boot1.service.EmployeeService;


@Controller
public class DeleteEmployee {
	

	@Autowired
	EmployeeService empService;

	@GetMapping("/DeleteEmployee")
	public String delete(@RequestParam("empId") int id,Model m)
	{
		empService.deleteEmployee(id);
		m.addAttribute("emp","Sucessful");
		return "success";
	}
}
