package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Admin;
import com.example.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired(required = true)
	IAdminService adminService;

	@PostMapping("/createadmin")

	ResponseEntity<String> createAdmin(@RequestBody Admin admin) {
		adminService.createAdmin(admin);
		return ResponseEntity.ok("admin " + admin.getEmail() + " is created");
	}

	@PostMapping("/adminlogin")

	public ResponseEntity<String> adminLogin(@RequestBody Admin admin) {
		String email = admin.getEmail();
		String password = admin.getPassword();
		return adminService.validateLogin(email, password);
	}
}
