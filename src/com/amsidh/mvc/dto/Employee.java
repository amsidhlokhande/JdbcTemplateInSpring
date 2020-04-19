/**
 * 
 */
package com.amsidh.mvc.dto;

/**
 * @author VIRU
 * 
 */
public class Employee {

	private Integer employeeId;
	public Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	private String employeeName;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
