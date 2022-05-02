package com.dsic.pdi.services;

import com.dsic.pdi.entities.AppRole;
import com.dsic.pdi.entities.AppUser;


public interface AccountService {

	public AppUser save(AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUser(String username,String roleName);
	public AppUser finduserByUsrname(String username);
}
