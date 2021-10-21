package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployController {

	 @Autowired
	 private EmployService service;
	 
	 @RequestMapping("/employ/{empno}")
	  public Employ show(@PathVariable int empno) {
			return service.search(empno);
	}
	 

		@PostMapping("/addEmploy")
		public void saveEmploy(@RequestBody Employ employ) {
			service.saveEmploy(employ);
		}
	
	@GetMapping("/")
	public List<Employ> list() {
	    return service.showEmploy();
	}
}
