package com.example.lab4restapi.service;

import com.example.lab4restapi.bean.Departments;
import com.example.lab4restapi.dao.DepartmentDao;
import com.example.lab4restapi.dao.impl.DepartmentDaoImpl;

public class DepartmentService {
    DepartmentDao departmentDao= new DepartmentDaoImpl();
    public boolean addDepartment(Departments departments){
        return departmentDao.addDepartment(departments);
    }
}
