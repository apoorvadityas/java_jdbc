package com.example.demo.Dept;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@CrossOrigin("*")
@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
	@RequestMapping(value="/department")
	public List<Department> list() {
		return service.listAll();
	}
	@PostMapping("/department/add")
	public void add(@RequestBody Department dept) {
		service.save(dept);
	}
	@RequestMapping("/deparment/{Deptid}")
	public ResponseEntity<Department> get(@PathVariable int Deptid) {
		try {
		Department dept = service.get(Deptid);
		return new ResponseEntity<Department>(dept,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Department>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/department/{Deptid}")
	public void delete(@PathVariable int Deptid) {
		service.delete(Deptid);
	}
	
}
