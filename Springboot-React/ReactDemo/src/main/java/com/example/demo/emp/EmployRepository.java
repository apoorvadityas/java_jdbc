package com.example.demo.emp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployRepository extends JpaRepository<Employee, Integer> {
	

	
}
