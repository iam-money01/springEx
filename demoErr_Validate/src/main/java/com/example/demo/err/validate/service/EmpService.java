package com.example.demo.err.validate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.err.validate.dto.EmpRequest;
import com.example.demo.err.validate.entity.Emp;
import com.example.demo.err.validate.repository.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo empRepo;
	
	public Emp saveEmp(EmpRequest empReq) {
		Emp emp = Emp.build(0, empReq.getName(), empReq.getSalary(), empReq.getEmail());
		return empRepo.save(emp);
	}
	
	public List<Emp> findALL(int id) {
		return empRepo.findAll();
	}
	
	public Emp getEmp(int id) {
		return empRepo.findByempId(id);
	}
}
