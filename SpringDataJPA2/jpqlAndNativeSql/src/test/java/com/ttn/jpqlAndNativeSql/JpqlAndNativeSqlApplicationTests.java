package com.ttn.jpqlAndNativeSql;

import com.ttn.jpqlAndNativeSql.EmployeeTableEntity.EmployeeTableEntity;
import com.ttn.jpqlAndNativeSql.Repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
@ContextConfiguration({"classpath*:spring/applicationContext.xml"})
class JpqlAndNativeSqlApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate()
	{

		EmployeeTableEntity emp = new EmployeeTableEntity();
		emp.setId(8L);
		emp.setFirstName("Jean");
		emp.setLastName("Grey");
		emp.setSalary(30);
		emp.setAge(25);

		EmployeeTableEntity emp2 = new EmployeeTableEntity();
		emp2.setId(9L);
		emp2.setFirstName("Jed");
		emp2.setLastName("Greene");
		emp2.setSalary(40);
		emp2.setAge(27);

		employeeRepository.save(emp);
		employeeRepository.save(emp2);

	}
	@Test
	public void testFindAllEmployees()
	{
		System.out.println(employeeRepository.findAllEmployees());
	}
}
