package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Employee;
import edu.learning.repository.EmployeeRepository;

@RestController
public class EmployeeController {
@Autowired
EmployeeRepository emprepo;
  
@PostMapping("/save-emp")
      public String saveEmp(@RequestBody Employee emp) {
	  emprepo.save(emp);
	  return "save employee";
}
@GetMapping("/get-all-emp")
public List<Employee> getAllemp(@RequestBody Employee emp){
	return emprepo.findAll();
}

}
