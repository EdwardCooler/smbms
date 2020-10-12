package com.zr.service.role;

import java.sql.Connection;
import java.util.List;

import com.zr.dao.BaseDao;
import com.zr.dao.role.RoleDao;
import com.zr.dao.role.RoleDaoImpl;
import com.zr.pojo.Role;

public class RoleServiceImpl implements RoleService{

    private RoleDao roleDao;

    public RoleServiceImpl(){
        roleDao = new RoleDaoImpl();
    }

    @Override
    public List<Role> getRoleList() {
        Connection connection = null;
        List<Role> roleList = null;
        try {
            connection = BaseDao.getConnection();
            roleList = roleDao.getRoleList(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            BaseDao.closeResource(connection, null, null);
        }
        return roleList;
    }

}
