package com.onerivet.userbook.model.payload;

import java.util.Set;

import com.onerivet.userbook.model.entity.Designation;
import com.onerivet.userbook.model.entity.ModeOfWork;
import com.onerivet.userbook.model.entity.Role;
import com.onerivet.userbook.model.entity.WorkingDay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDto {
	
	private int id;
	private String userId;
	private String emailId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String project;
	private String profilePictureFileName;
	private String profilePictureFilePath;
	private ModeOfWorkDto modeOfWork;
	private DesignationDto designation;
	private Set<RoleDto> role;
	private Set<WorkingDayDto> workingDay;
	
	

}
