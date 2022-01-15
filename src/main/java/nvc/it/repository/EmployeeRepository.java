package nvc.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.model.employee;

public interface EmployeeRepository extends JpaRepository< employee, Integer>{


    List<employee> findByNameContaining(String name);
    

    List<employee> findBySalaryLessThanEqual(int salary);
    
    

}