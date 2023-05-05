package com.onerivet.userbook.model.entity;


import java.util.Set;

import com.onerivet.userbook.model.payload.ModeOfWorkDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee",schema = "dbo")
public class Employee {
	
	@Id
	@Column(name = "EmployeeId")
	private int id;
	
	@Column(name = "UserId")
	private String userId;
	
	@Column(name="EmailId")
	private String emailId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "PhoneNumber")
	private String phoneNumber;
	
	@Column(name = "Project")
	private String project;
	
	@Column(name = "ProfilePictureFileName")
	private String profilePictureFileName;
	
	@Column(name = "ProfilePictureFilePath")
	private String profilePictureFilePath;
	
	@OneToOne()
	@JoinColumn(name = "ModeOfWorkId")
	private ModeOfWork modeOfWork; 
	
	@OneToOne()
	@JoinColumn(name = "DesignationId")
	private Designation designation;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "SeatConfiguration")
//	private SeatConfiguration seatConfiguration;
//	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EmployeeRole", schema = "dbo",
	joinColumns=@JoinColumn(name = "RoleId"),inverseJoinColumns = @JoinColumn(name = "EmployeeId"))
	private Set<Role> role;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EmployeeWorkingDays", schema = "dbo",
	joinColumns = @JoinColumn(name = "EmployeeId"),
	inverseJoinColumns = @JoinColumn(name = "WorkingDayId"))
	private Set<WorkingDay> workingDay;
		
	@Column(name = "isActive")
	private boolean isActive;
	
	
	
	
	

}
