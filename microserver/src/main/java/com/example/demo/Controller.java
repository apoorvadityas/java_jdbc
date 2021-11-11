package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	 @Autowired
	 private EmployeeService service1;
	 private LeaveHistoryService service2;
	
	 @RequestMapping("/employee/")
	 public List<employee> show2() {
			return service1.show();
		}
	 
		@RequestMapping("/employee/{id}")
		public employee get(@PathVariable Integer id) {
			return service1.showByEmpId(id);
		}
		
		@RequestMapping("/leaveHistory/")
		public List<LeaveHistory> show() {
			return service2.show();
		}

}
