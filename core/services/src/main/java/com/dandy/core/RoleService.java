package com.dandy.core;

import java.util.List;

public class RoleService {
    private RoleDao roleDao;

    private PersonDao personDao;
 
    public RoleDao getRoleDao() {
        return roleDao;
    }
 
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> getRoles() {
        return getRoleDao().getRoles();
    }

}
