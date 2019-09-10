package com.sakha.boot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.boot1.model.Employee;
import com.sakha.boot1.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee save(Employee emp)
	{
		
		return repo.save(emp);	
	}
	
	public Employee getEmployee(int empId)
	{
		return repo.getOne(empId);
	}
	
	public Employee getEmployeeByName(String empName) {
		return repo.findByName(empName);
	}
	
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}
	
	
	public void deleteEmployee(int empId)
	{
		repo.deleteById(empId);
	}

//	public void update(Employee emp) {
//		 repo.save(emp);
//	}
	
public void UpdateEmployee(Employee emp) {
		Employee emp2 = repo.getOne(emp.getEmpId());
		System.out.println(emp2);
		emp2.setDob(emp.getDob());
		emp2.setEmpName(emp.getEmpName());
		emp2.setSalary(emp.getSalary());
		repo.save(emp2);
		
	}

}
