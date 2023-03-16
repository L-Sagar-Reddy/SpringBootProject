package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnineleaps.onlineshoppingsystem.entity.Admin;
import com.nnineleaps.onlineshoppingsystem.repository.AdminRepository;

@Service
public class AdminServiceImpl implements IAdminService{
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> getAllAdmins() {
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(Long adminId) {
		return adminRepository.findById(adminId).get();
	}

	@Override
	public Admin updateAdmin(Long adminId, Admin updatedAdmin) {
		
		  Admin admin =getAdminById(adminId); if(admin!=null) {
		  admin.setAdminName(updatedAdmin.getAdminName());
		  admin.setAdminMobno(updatedAdmin.getAdminMobno());
		  }
		  adminRepository.save(admin);
		 
		return admin;
	}

	@Override
	public void deleteAdmin(Long adminId) {
		adminRepository.deleteById(adminId);
		
	}

	@Override
	public Admin insertAdmin(Admin newAdmin) {
		return adminRepository.save(newAdmin);
	}

}
