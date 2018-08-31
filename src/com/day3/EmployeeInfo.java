package com.day3;

public class EmployeeInfo {
	private int employeeid;
	private String employeename;
	private double HRA;
	private double PF;
	private double medical;
	private double basicSalary;
	private double grossSalary;
	private double NetSalary;
	public static final double PT = 200;

	public EmployeeInfo() {

	}

	public EmployeeInfo(int employeeid, String employeename, double basicSalary, double medical) {
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public double calculateNetSalary() {
		HRA = 0.5 * basicSalary;
		PF = 0.12 * basicSalary;
		grossSalary = HRA + basicSalary + medical;
		NetSalary = grossSalary - (PF + PT);
		return NetSalary;
	}

	public void displayEmployeeInfo() {
	   System.out.println("employeeid:" +employeeid+  "employeename:" +employeename+ "NetSalary:" +NetSalary);
   }
}
