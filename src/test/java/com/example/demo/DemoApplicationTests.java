package com.example.demo;

import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private EmployeeDao employeedao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("suguagua");
		employee.setLocation("beijing");
		employee.setBranch("cipher");
		employeedao.save(employee);
	}

//	@Test
	void getAllAndDeleteAllEmployeeTets() {
		List<Employee> employeeList = employeedao.getAllEmployees();
		for(Employee employee:employeeList) {
			System.out.println(employee);
			employeedao.delete(employee);
		}
	}




}
