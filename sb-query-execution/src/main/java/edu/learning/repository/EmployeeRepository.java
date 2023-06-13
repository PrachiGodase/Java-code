package edu.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
@Query(value= "select from Employee where experience>:exp")
public List<Employee> getEmpByExperienceSql(@Param("exp") double exp);
}
