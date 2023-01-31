package com.cg.hbm.service;

import java.util.Optional;

import com.cg.hbm.entity.Admin;

public interface AdminService {
	public Admin addAdmin(Admin admin);

	public boolean validateAdmin(String username, String password);

	public Optional<Admin> viewByAdminUserName(String username, String password);

}
