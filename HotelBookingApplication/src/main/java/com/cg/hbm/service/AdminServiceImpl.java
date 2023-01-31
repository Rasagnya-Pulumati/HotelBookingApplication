package com.cg.hbm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.entity.Admin;
import com.cg.hbm.exception.AdminFoundException;
import com.cg.hbm.exception.AdminNotFoundException;
import com.cg.hbm.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminrepo;

	@Override
	public Admin addAdmin(Admin admin) {
		Admin obj = adminrepo.findByAdminUsername(admin.getAdminUsername());
		if(obj != null)
			throw new AdminFoundException("Admin already created");
		return adminrepo.save(admin);
	}

	@Override
	public boolean validateAdmin(String username, String password) {
		Optional<Admin> admin = adminrepo.findByAdminUsernameAndAdminpassword(username, password);
		if(admin.get() == null)
			throw new AdminNotFoundException("Admin not created");
		else
			return true;
	}

	@Override
	public Optional<Admin> viewByAdminUserName(String username, String password) {
		Optional<Admin> admin = adminrepo.findByAdminUsernameAndAdminpassword(username, password);
		if(admin.get() == null)
			throw new AdminNotFoundException("Admin not created");
		return admin;		
	}

}
