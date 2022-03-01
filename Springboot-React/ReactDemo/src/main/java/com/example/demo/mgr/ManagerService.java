package com.example.demo.mgr;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;







@Service
@Transactional
public class ManagerService {
	@Autowired
	private ManagerRepository repo;
	
	public List<Manager> listAll() {
		return repo.findAll();
	}
	public void save(Manager Mgr) {
		repo.save(Mgr);
	}
	public void update(Manager mgr) {
		repo.save(mgr);
	}
	public Manager get(int mgrid) {
		return repo.findById(mgrid).get();
	}
	public void delete(int mgrid) {
		repo.deleteById(mgrid);
	}
	
	
}
	

