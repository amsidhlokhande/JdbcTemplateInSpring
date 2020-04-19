/**
 * 
 */
package com.amsidh.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.dao.EmployeeDao;
import com.amsidh.mvc.dto.Employee;

/**
 * @author VIRU
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractApplicationContext context=new ClassPathXmlApplicationContext("resource/spring.xml");
     EmployeeDao employeedao=(EmployeeDao)context.getBean("employeeDao");
     System.out.println(employeedao.retriveEmployee(123).getEmployeeName());
     Employee emp=new Employee(1,"Raju Lokhande");
     employeedao.createEmployee(emp);
     System.out.println(employeedao.retriveEmployee(1).getEmployeeName());
	}

}
