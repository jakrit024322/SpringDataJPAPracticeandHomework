package nvc.it.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import nvc.it.model.Department;
import nvc.it.model.Project;
import nvc.it.model.employee;
import nvc.it.repository.DepartmentRepository;
import nvc.it.repository.ProjectRepository;
import nvc.it.service.EmployeeService;



@Controller
public class MainController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/")
    public String index () {
        return "index";
    }
    
    @GetMapping("/employee")
    public ModelAndView employee () {
        List<employee> employees = employeeService.findAll();
        return new ModelAndView("employee","employees",employees);
    }

    @GetMapping("/employee/name/{name}")
    public ModelAndView getEmployeeByName (@PathVariable("name")String name) {
        List<employee> employees = employeeService.findByName(name);
        return new ModelAndView("employee","employees",employees);
    }

    @GetMapping("/employee/salary/{salary}")
    public ModelAndView getEmployeeBySalary (@PathVariable("salary")int salary) {
        List<employee> employees = employeeService.findBySalary(salary);
        return new ModelAndView("employee","employees",employees);
    }

    @GetMapping("/department/employee")
    public ModelAndView getDepartments(){
        List<Department> departments = departmentRepository.findAll();
        return new ModelAndView("department","departments",departments);
    }

    @GetMapping("/project/employee")
    public ModelAndView getprojects(){
        List<Project> projects = projectRepository.findAll();
        return new ModelAndView("project","projects",projects);
    }



}
