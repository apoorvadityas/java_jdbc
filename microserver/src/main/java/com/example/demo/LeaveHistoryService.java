package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class LeaveHistoryService {
	@Autowired
	private LeaveHistoryRepository repos;
	
	public List<LeaveHistory> show() {
		return repos.findAll();
	}

	

}
