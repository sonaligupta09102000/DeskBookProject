package com.onerivet.userbook.service;

import java.util.List;

import com.onerivet.userbook.model.payload.EmployeeDto;

public interface EmployeeService {

//	public String addEmployee(EmployeeDto employeeDto);

	public List<EmployeeDto> getAllEmployee();
	
	public EmployeeDto getbyId(int id);
	
	public String updatebyId(int id, EmployeeDto employeeDto);
	
	
	
	
	

}
