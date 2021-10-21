package com.example.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployService {

	@Autowired
    private EmployRepository repo;
	
	public Employ search(int empno) {
		return repo.findById(empno).get();
	}
	public List<Employ> showEmploy() {
		return repo.findAll();
	}
	
	public void saveEmploy(Employ employ) {
		 repo.save(employ);
	}
}
