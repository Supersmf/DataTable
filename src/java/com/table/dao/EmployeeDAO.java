/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.table.dao;

import com.table.model.Employee;
import com.table.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SMF
 */
public class EmployeeDAO {
    
    private Session session = null;
    private List<Employee> employees = null;
    
    public List<Employee> getEmployees(){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("From Employee as employee");
        employees = (List<Employee>) q.list();
        tx.commit();
        tx = null;
        return employees;      
        
    }
}
