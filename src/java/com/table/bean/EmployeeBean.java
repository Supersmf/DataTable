
package com.table.bean;

import com.table.dao.EmployeeDAO;
import com.table.model.Employee;
import java.io.Serializable;
import java.util.List;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author SMF
 */
@Named(value = "employeeBean")
@ViewScoped
public class EmployeeBean implements Serializable{

        private List<Employee> employees = null;
        
        public List<Employee> getEmployees(){
            EmployeeDAO employeeDAO = new EmployeeDAO();
            employees = employeeDAO.getEmployees();
            return employees;
        }
    
    
}
