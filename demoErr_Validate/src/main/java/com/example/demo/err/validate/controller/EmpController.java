package com.example.demo.err.validate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.err.validate.dto.EmpRequest;
import com.example.demo.err.validate.entity.Emp;
import com.example.demo.err.validate.service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/createEmp")
	private ResponseEntity<Emp> saveEmp(@RequestBody EmpRequest empReq) {
		
		return new ResponseEntity<Emp>(empService.saveEmp(empReq),HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchEmployees")
	private ResponseEntity<List <Emp>>findALL(int id) {
		return ResponseEntity.ok(empService.findALL(id));
	}
	
	@GetMapping("/getEmployee")
	private ResponseEntity<Emp> getEmp(@PathVariable int id) {
		return ResponseEntity.ok(empService.getEmp(id));
	}
		
}


