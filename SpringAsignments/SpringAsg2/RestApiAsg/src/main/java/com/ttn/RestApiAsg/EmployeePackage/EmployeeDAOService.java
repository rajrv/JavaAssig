package com.ttn.RestApiAsg.EmployeePackage;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class EmployeeDAOService {

    private static List<Employee> emp = new ArrayList<>();
    private static int employeeCount = 1000;

    static {
        emp.add(new Employee(++employeeCount,"Alex",24));
        emp.add(new Employee(++employeeCount,"Claire",23));
        emp.add(new Employee(++employeeCount,"Steve",30));
    }
    public List<Employee> findAll()
    {
        return emp;
    }

    public Employee findOne(Integer id)
    {
        Predicate<? super Employee> predicate = emp->emp.getId().equals(id);
        return emp.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(Integer id)
    {
        Predicate<? super Employee> predicate = emp->emp.getId().equals(id);
        emp.removeIf(predicate);
    }

    public Employee save(Employee empl)
    {
        empl.setId(++employeeCount);
        emp.add(empl);
        return  empl;
    }
}
