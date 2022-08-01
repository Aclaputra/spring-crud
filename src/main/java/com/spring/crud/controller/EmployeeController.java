package com.spring.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.crud.entity.Employee;
import com.spring.crud.service.EmployeeService;

public class EmployeeController {

    private EmployeeService service;

    // POST

    /**
     * addEmployee function
     * @param employee
     * @return
     */
    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }
    /**
     * addEmployees function
     * @param employee
     * @return
     */
    @PostMapping("/addemployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employee) {
        return service.saveEmployees(employee);
    }
}