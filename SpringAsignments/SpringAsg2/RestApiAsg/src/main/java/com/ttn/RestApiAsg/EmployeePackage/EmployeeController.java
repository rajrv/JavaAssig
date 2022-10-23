package com.ttn.RestApiAsg.EmployeePackage;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeDAOService employeeDAOService;

    public EmployeeController(EmployeeDAOService employeeDAOService) {

        this.employeeDAOService = employeeDAOService;
    }

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployee(){
        return employeeDAOService.findAll();

    }
    @GetMapping("employees/{id}")
    public Employee retrieveEmployees(@PathVariable int id)
    {
        Employee e = employeeDAOService.findOne(id);

        if(e==null)
            throw new UserNotFoundException("id:"+id);
        return e;
    }

    @DeleteMapping("employees/{id}")
    public void deleteEmployees(@PathVariable int id)
    {
        employeeDAOService.deleteById(id);
    }

    @PostMapping("/employees")
    public void createEmployee(@Valid @RequestBody Employee emp){
        employeeDAOService.save(emp);

    }
    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee eChanges,@PathVariable int id){
        Employee eCurrent = employeeDAOService.findOne(id);
        if(eCurrent == null)
            throw new UserNotFoundException("id:"+id);

        employeeDAOService.updateEmployee(eCurrent,eChanges);
    }
}