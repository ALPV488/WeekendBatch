package com.oops;

public class Employee {	//pojo -plain old java Object
	
	private int empId;
	
	private String empName;
	
	private int empSal;
	
	private String empAdd;
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}


	public Employee() {
		
	}
	
	
	public Employee(int empId, String empName, int empSal, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}





	public int getEmpId() {				//getter method:-to retrive the info 
		return empId;
	}

	public void setEmpId(int empId) {			//setter mthod:- to initialize/set the value
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	
	

	

}
