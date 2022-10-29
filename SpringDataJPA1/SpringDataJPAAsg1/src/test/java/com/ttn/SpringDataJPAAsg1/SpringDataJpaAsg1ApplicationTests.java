package com.ttn.SpringDataJPAAsg1;

import com.ttn.SpringDataJPAAsg1.EmployeeEntity.EmployeeEntity;
import com.ttn.SpringDataJPAAsg1.EmployeeRepos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
class SpringDataJpaAsg1ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {

		EmployeeEntity emp = new EmployeeEntity();
		emp.setId(1);
		emp.setName("Alex");
		emp.setAge(23);
		emp.setLocation("New Delhi");

		employeeRepository.save(emp);

	}

	@Test
	public void testRead() {
		EmployeeEntity employee = employeeRepository.findById(1).get();
		assertNotNull(employee);
		assertEquals("Alex", employee.getName());
		System.out.println("*******************" + employee.getLocation());
	}

	@Test
	public void testUpdate() {
		EmployeeEntity employee = employeeRepository.findById(1).get();
		employee.setAge(25);
		employeeRepository.save(employee);
	}

	@Test
	public void testDelete() {
		if (employeeRepository.existsById(1)) {
			employeeRepository.deleteById(1);
		}
	}

	@Test
	public void testCount() {
		System.out.println("Number of rows in the table>>>>>>> " + employeeRepository.count());
	}

	@Test
	public void testFindByName() {
		List<EmployeeEntity> emp = employeeRepository.findByName("Max");
		emp.forEach(e -> System.out.println("ID of Max: " + e.getId()));
	}

	@Test
	public void testFindByNameLike() {
		List<EmployeeEntity> emp = employeeRepository.findByNameLike("A%");
		emp.forEach(e -> System.out.println("Employee Names starting with A : " + e.getName()));
	}

	@Test
	public void testFindByAgeBetween() {
		List<EmployeeEntity> emp = employeeRepository.findByAgeBetween(28, 32);
		emp.forEach(e -> System.out.println("Employees whose age is between 28 and 32: " + e.getName()));
	}

	@Test
	public void testFindAllPaging() {
		Pageable pageable = PageRequest.of(1, 2);
		Page<EmployeeEntity> output = employeeRepository.findAll(pageable);
		output.forEach(e -> System.out.println(e.getName()));
	}

	@Test
	public void testFindAllSortingByAge()
	{
		employeeRepository.findAll(Sort.by("age")).forEach(e-> System.out.println(e.getName()+" "+e.getAge()+" "+e.getId()));
	}

	@Test
	public void testFindAllPagingAndSortingByAge()
	{
		Pageable pageable = PageRequest.of(1,2, Sort.Direction.ASC,"age");
		employeeRepository.findAll(pageable).forEach(e->System.out.println(e.getName()+" "+e.getAge()+" "+e.getId()));
	}

}
