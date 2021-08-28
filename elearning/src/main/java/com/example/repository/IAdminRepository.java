package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer> {
	public Admin findByEmail(String email);
	
}
