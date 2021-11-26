package com.example.lab4restapi.service;

import com.example.lab4restapi.bean.Employees;
import com.example.lab4restapi.dao.EmployeesDao;
import com.example.lab4restapi.dao.impl.EmployeesDaoImpl;

import java.util.List;

public class EmployeesService {
    EmployeesDao employeesDao = new EmployeesDaoImpl();
    public boolean addEmployee(Employees employees){
        return employeesDao.addEmployee(employees);
    }
    public List<Employees> getEmployees(){
        return employeesDao.getEmployees();
    }
    public Employees getEmployeeByID(int id){
        return employeesDao.getEmployeeByID(id);
    }
}
