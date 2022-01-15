package nvc.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>  {
    
}
