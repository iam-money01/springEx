package com.example.demo.err.validate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Emp {
	
	@Id
	@GeneratedValue
	private int empId;
	private String name;
	private int salary;
	private String email;

}
