package com.example.demo.err.validate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class EmpRequest {

	int id;
	String name;
	int salary;
	String email;
}
