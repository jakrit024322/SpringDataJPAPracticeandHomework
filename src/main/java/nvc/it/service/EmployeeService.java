package nvc.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.model.employee;
import nvc.it.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    //Get all products
    public List<employee> findAll(){
        return employeeRepository.findAll();
    }

    public List<employee> findByName(String name){
        return employeeRepository.findByNameContaining(name);
    }

    public List<employee> findBySalary(int salary){
        return employeeRepository.findBySalaryLessThanEqual(salary);
    }

}
