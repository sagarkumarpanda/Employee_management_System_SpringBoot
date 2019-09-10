package com.sakha.boot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakha.boot1.model.Employee;
import com.sakha.boot1.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/employee")
	public String registerEmployee(@ModelAttribute Employee emp,Model m) {
		
		Employee savedEmp=service.save(emp);
		m.addAttribute("emp"," Opreation Sucessful.......");
		return "view";
	}
	
	@GetMapping("/employeeByname")
	public String getEmployeeByName(@RequestParam("empName") String empName,Model m)
	{
	
		Employee emp=service.getEmployeeByName(empName);
		m.addAttribute("emp",emp);
		return "view";
	}
	
	@GetMapping("/employeeid")
	public String getEmployee(@RequestParam("empId") int empId,Model m)
	{
		Employee emp=service.getEmployee(empId);
		m.addAttribute("emp",emp);
		return "view";
	}
	
	@PostMapping("/findallemp")
	public String getAllEmployee(Model m){
		List<Employee> list=service.getAllEmployee();
		m.addAttribute("emp",list);
		return "viewall";
		
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("empId") int empId,Model m)
	{
		service.deleteEmployee(empId);
		m.addAttribute("emp","sucessfull...");
		return "success";
	
	}
	
	@GetMapping("/update")
	public String update(@ModelAttribute("emp") Employee emp,Model m){    
        service.update(emp);    
        m.addAttribute("emp","update sucessfully...");
        return "success";    
    }    
}
