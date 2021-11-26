package com.example.lab4restapi;

import com.example.lab4restapi.bean.Departments;
import com.example.lab4restapi.bean.Employees;
import com.example.lab4restapi.dao.impl.DepartmentDaoImpl;
import com.example.lab4restapi.dao.impl.EmployeesDaoImpl;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class Main {
    public static void main(String[] args) {
//        oneWay();
        adddata();

        System.out.println("done");
    }
    private static void adddata() {

        DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();
        Departments dep1 = new Departments();
        dep1.setDept_id(1);
        dep1.setName("TA");
        dep1.setAddress("Bangalore");
        departmentDao.addDepartment(dep1);

        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();
        Employees emp1 = new Employees();
        emp1.setEmp_id(1);
        emp1.setName("Vaibhavi");
        emp1.setDob("09-10-98");
        emp1.setDepartments(dep1);
        employeesDao.addEmployee(emp1);
    }
}