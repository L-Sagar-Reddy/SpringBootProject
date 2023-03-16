package com.nnineleaps.onlineshoppingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nnineleaps.onlineshoppingsystem.entity.Admin;
import com.nnineleaps.onlineshoppingsystem.service.IAdminService;

@RestController
public class AdminController {
	
	@Autowired
	private IAdminService adminService;
	
	@PostMapping("/insertadmin")
	public String insertAdmin(@RequestBody Admin newAdmin) {
		adminService.insertAdmin(newAdmin);
		return "Admin added successfully!!";
	}

	@DeleteMapping("/deleteadmin/{adminid}")
	public void deleteEmployee( @PathVariable ("adminid")Long adminId ){
		adminService.deleteAdmin(adminId);
	}
	

	@GetMapping("/getalladmins")
	public List<Admin>getAllAdmins(){
		return adminService.getAllAdmins();
	}
	

	@PutMapping("/updateadmin/{adminid}")
	public Admin updateAdmin(@PathVariable("adminid")Long adminId,@RequestBody Admin updateAdmin) {
		return adminService.updateAdmin( adminId, updateAdmin);
	}

}
