package com.example.lab4restapi.dao.impl;

import com.example.lab4restapi.bean.Departments;
import com.example.lab4restapi.bean.Employees;
import com.example.lab4restapi.dao.DepartmentDao;
import com.example.lab4restapi.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public boolean addDepartment(Departments dept) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(dept);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }



}
