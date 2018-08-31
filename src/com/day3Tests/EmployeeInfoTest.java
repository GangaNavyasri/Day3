package com.day3Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.day3.EmployeeInfo;

class EmployeeInfoTest {
	EmployeeInfo Employee;

	@BeforeEach
	void setup() {
		Employee = new EmployeeInfo(1234, "navya", 13000, 2500);
	}

	@Test
	void testcalculateNetSalary() {
		assertEquals(20240.0, Employee.calculateNetSalary(), 0.02);

	}

	@AfterEach
	void teardown() {
		Employee = null;

	}

}
