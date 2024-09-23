package com.example.demo.err.validate.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class EmpRequest {

	int id;
	@NotNull(message = "Name should not be empty")
	String name;
	@Max(25000)
	int salary;
	@Email(message = "Invalid Email")
	String email;
}
