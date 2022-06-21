package com.kostkin.spring.boot.spring_boot.service;

import com.kostkin.spring.boot.spring_boot.dao.EmployeeDAO;
import com.kostkin.spring.boot.spring_boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    /*@Override
    @Transactional
    public void saveEmployee(Employee employee) {

    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return null;
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {

    }*/
}
