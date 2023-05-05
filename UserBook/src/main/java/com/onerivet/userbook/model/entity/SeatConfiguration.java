package com.onerivet.userbook.model.entity;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "SeatConfiguration",schema = "dbo")
public class SeatConfiguration {
	
	@Id
	@Column(name = "SeatConfigurationId")
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CityId")
	private City city;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FloorId")
	private Floor floor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SeatNumberId")
	private SeatNumber seatNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EmployeeId")
	private Employee employee;
	
	
	
	
	

	

}
