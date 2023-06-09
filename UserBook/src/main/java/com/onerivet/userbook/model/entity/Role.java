package com.onerivet.userbook.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "Role",schema = "Ref")
public class Role {
	
	@Id
	@Column(name = "RoleId")
	private int id;
	
	@Column(name = "RoleName")
	private String roleName;
	

}
