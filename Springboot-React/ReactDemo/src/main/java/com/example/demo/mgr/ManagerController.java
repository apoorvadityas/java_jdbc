package com.example.demo.mgr;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
public class ManagerController {
	@Autowired
	private ManagerService service;
	
	@RequestMapping(value="/manager/")
	public List<Manager> list() {
		return service.listAll();
	}
	@DeleteMapping("/manager/{mgrid}")
	public void delete(@PathVariable int mgrid) {
		service.delete(mgrid);
	}
	
	@PutMapping("/manager/update")
	public void updat(@RequestBody Manager mgr) {
		service.update(mgr);
	}
	
	@PostMapping("/manager/add")
	public void add(@RequestBody Manager mgr) {
		service.save(mgr);
	}
	
	
	
	@RequestMapping("/manager/{mgrid}")
	public ResponseEntity<Manager> get(@PathVariable int mgrid) {
		try {
		Manager mgr = service.get(mgrid);
		return new ResponseEntity<Manager>(mgr,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Manager>(HttpStatus.NOT_FOUND);
		}
	}
}
