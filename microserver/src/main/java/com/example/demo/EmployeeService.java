package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	
    private EmployeeRepository repo1;
	
	
	public List<employee> show() {
		return repo1.findAll();
	}
	
	
	public employee showByEmpId(int empId) {
		// repo.getById(empno);
		return repo1.findById(empId).get();
	}


	public void saveEmployee(employee employ) {
		// TODO Auto-generated method stub
		repo1.save(employ);
	}

	public void deleteEmployee(employee employ) {
		// TODO Auto-generated method stub
		repo1.delete(employ);
	}


	
	

}
