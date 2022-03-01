package com.example.demo.mgr;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ManagerRepository extends JpaRepository<Manager, Integer> {

}