package com.sakha.boot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping("/employeeByname")
	public String getEmployeeByName(@RequestParam("empName") String empName,Model m)
	{
	
		Employee emp=service.getEmployeeByName(empName);
		m.addAttribute("emp",emp);
		return "viewemp";
	}
	
	@PostMapping("/employeeid")
	public String getEmployee(@RequestParam("empId") int empId,Model m)
	{
		Employee emp=service.getEmployee(empId);
		m.addAttribute("emp",emp);
		return "viewemp";
	}
	
	@GetMapping("/findallemp")
	public String getAllEmployee(Model m){
		List<Employee> list=service.getAllEmployee();
		m.addAttribute("list",list);
		return "viewall";
	}
	
	@GetMapping(value="/updater")    
    public String update(@RequestParam("empId") int empId,Model m){    
        Employee emp=service.getEmployee(empId); 
        m.addAttribute("emp",emp);  
        return "updateemp";    
    }    

}
