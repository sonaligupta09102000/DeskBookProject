package com.onerivet.userbook.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.userbook.model.entity.Designation;
import com.onerivet.userbook.model.entity.Employee;
import com.onerivet.userbook.model.entity.ModeOfWork;
import com.onerivet.userbook.model.entity.Role;
import com.onerivet.userbook.model.entity.WorkingDay;
import com.onerivet.userbook.model.payload.DesignationDto;
import com.onerivet.userbook.model.payload.EmployeeDto;
import com.onerivet.userbook.model.payload.ModeOfWorkDto;
import com.onerivet.userbook.model.payload.RoleDto;
import com.onerivet.userbook.model.payload.WorkingDayDto;
import com.onerivet.userbook.repository.EmployeeRepsitory;

@Service
public class EmployeeImplies implements EmployeeService {
	
	@Autowired
	private EmployeeRepsitory employeeRepsitory;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	//Entity to DTO
	public EmployeeDto employeetoemployeedto(Employee employee)
	{
		EmployeeDto employeeDto = this.modelMapper.map(employee, EmployeeDto.class);
		return employeeDto;
	}
	
	//DTO to Entity
	public Employee employeedtotoemployee(EmployeeDto employeeDto)
	{
		Employee employee = this.modelMapper.map(employeeDto, Employee.class);
		return employee;
	}
	
	
//	@Override
//	public String addEmployee(EmployeeDto employee) {
//		// TODO Auto-generated method stub
//		Employee employee2 = this.employeedtotoemployee(employee);
//		employeeRepsitory.save(employee2);
//		return "SuccessFully Added";
//	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> findAll = employeeRepsitory.findAll();
		return findAll.stream().map(x->employeetoemployeedto(x)).collect(Collectors.toList());
	}

	@Override
	public EmployeeDto getbyId(int id) {
		Employee findById = employeeRepsitory.findById(id).get();
		return this.employeetoemployeedto(findById);
	}

	@Override
	public String updatebyId(int id, EmployeeDto employee) {
		Employee employee1 = this.employeeRepsitory.findById(id).get();
		Employee employee2 = this.modelMapper.map(employee,Employee.class);
		employee1.setFirstName(employee2.getFirstName());
		employee1.setLastName(employee2.getLastName());
		employee1.setEmailId(employee2.getEmailId());
		employee1.setPhoneNumber(employee2.getPhoneNumber());
		employee1.setProject(employee2.getProject());
		employee1.setProfilePictureFileName(employee2.getProfilePictureFileName());
		employee1.setProfilePictureFilePath(employee2.getProfilePictureFilePath());
		employee1.setDesignation(employee2.getDesignation());
		employee1.setModeOfWork(employee2.getModeOfWork());
		employee1.setRole(employee2.getRole());
		employeeRepsitory.save(employee1);
		return "Updated Successfully";
	}

	

	
}
