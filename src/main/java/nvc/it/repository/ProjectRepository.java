package nvc.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.model.Project;

public interface ProjectRepository  extends JpaRepository<Project, Integer> {
    
}
