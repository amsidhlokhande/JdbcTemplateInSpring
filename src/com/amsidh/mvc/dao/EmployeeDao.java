/**
 * 
 */
package com.amsidh.mvc.dao;

import java.util.List;

import com.amsidh.mvc.dto.Employee;

/**
 * @author VIRU
 *
 */
public interface EmployeeDao {
   
	public void createEmployee(Employee employee);
	public void removeEmployee(Integer employeeId);
	public void updateEmployee(Employee employee);
	public Employee retriveEmployee(Integer employeeId);
	public List<Employee> getAllEmployee();
	
}
