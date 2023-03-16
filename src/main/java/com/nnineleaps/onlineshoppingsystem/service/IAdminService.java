package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import com.nnineleaps.onlineshoppingsystem.entity.Admin;

public interface IAdminService {
	
	public List<Admin>getAllAdmins();
	public Admin getAdminById(Long adminId);
	public Admin updateAdmin(Long adminId,Admin updatedAdmin);
	public void deleteAdmin(Long adminId);
	public Admin insertAdmin(Admin newAdmin);

}
