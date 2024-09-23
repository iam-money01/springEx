package com.example.demo.err.validate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.err.validate.entity.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer>{
	Emp findByempId(int id);
	
}
