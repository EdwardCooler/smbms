package com.zr.dao.role;


import java.sql.Connection;
import java.util.List;
import com.zr.pojo.Role;

public interface RoleDao {

    public List<Role> getRoleList(Connection connection)throws Exception;

}

