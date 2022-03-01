package com.example.demo.emp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class EmployService {

	@Autowired
	private EmployRepository repo;
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	public void update(Employee employ) {
		repo.save(employ);
	}
	public void save(Employee employ) {
		repo.save(employ);
	}
	public Employee get(int id) {
		return repo.findById(id).get();
	}
	
	
	public List<Employee> listAll() {
	        return repo.findAll();
	    }
	}
	
