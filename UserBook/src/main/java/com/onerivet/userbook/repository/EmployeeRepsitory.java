package com.onerivet.userbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onerivet.userbook.model.entity.Employee;

public interface EmployeeRepsitory extends JpaRepository<Employee, Integer>{

	
}
