package com.example.demo.Dept;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DepartmentService {
	
	
		@Autowired
		private DepartmentRepository repo;
		
		public List<Department> listAll() {
			return repo.findAll();
		}
		public void save(Department dept) {
			repo.save(dept);
		}
		public void update(Department dept) {
			repo.save(dept);
		}
		public Department get(int Deptid) {
			return repo.findById(Deptid).get();
		}
		public void delete(int Deptid) {
			repo.deleteById(Deptid);
		}
		
		
	}
		


