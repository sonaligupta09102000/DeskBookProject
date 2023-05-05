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
@Table(name = "SeatNumber",schema = "Ref")
public class SeatNumber {
	
	@Id
	@Column(name = "SeatNumberId")
	private int id;
	
	@Column(name = "SeatNumber")
	private String seatNumber;
	
	
	

}
