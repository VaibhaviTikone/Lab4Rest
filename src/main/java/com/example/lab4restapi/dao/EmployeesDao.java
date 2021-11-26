package com.example.lab4restapi.dao;

import com.example.lab4restapi.bean.Employees;

import java.util.List;

public interface EmployeesDao {
    boolean addEmployee(Employees emp);
    List<Employees> getEmployees();
    Employees getEmployeeByID (int id);
}
