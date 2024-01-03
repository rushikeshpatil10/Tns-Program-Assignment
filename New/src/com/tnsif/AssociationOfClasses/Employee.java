package com.tnsif.AssociationOfClasses;

public class Employee {
    
	
	int employee_id;
	String emp_name;
	String dept_name;
	public Employee(int employee_id, String emp_name, String dept_name) {
		super();
		this.employee_id = employee_id;
		this.emp_name = emp_name;
		this.dept_name = dept_name;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", emp_name=" + emp_name + ", dept_name=" + dept_name + "]";
	}
	
	
	
}
