package com.example.demo.emp;

import java.util.List;
import java.util.NoSuchElementException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@CrossOrigin("*")
@RestController
public class EmployController {

	@Autowired
	private EmployService service;
	
	@RequestMapping(value="/")
	public List<Employee> list() {
		return service.listAll();
	}
	
	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
	
	@PutMapping("/employees")
	public void updat(@RequestBody Employee employ) {
		service.update(employ);
	}
	
	@PostMapping("/employees")
	public void add(@RequestBody Employee employ) {
		service.save(employ);
	}
	
	
	
	@RequestMapping("/employees/{id}")
	public ResponseEntity<Employee> get(@PathVariable int id) {
		try {
		Employee employ = service.get(id);
		return new ResponseEntity<Employee>(employ,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}
}
