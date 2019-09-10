package com.sakha.boot1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sakha.boot1.model.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{
	
	@Query("from Employee where empName=:name")
	public Employee findByName(String name);
	
	@Query("from Employee Where empId=:id")
	public Employee getOne(int id);

	//@Query("delete from Employee Where empId=:id")
	//public Employee deleteById(int id);
	
}
