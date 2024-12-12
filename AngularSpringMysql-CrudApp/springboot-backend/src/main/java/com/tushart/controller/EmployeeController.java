package com.tushart.controller;

import com.tushart.exception.ResourceNotFoundException;
import com.tushart.model.Employee;
import com.tushart.model.repository.EmployeeRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class EmployeeController {
  private final EmployeeRepository employeeRepository;

  public EmployeeController(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @GetMapping("/employees")
  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }

  @PostMapping("/employees")
  public Employee createEmployee(@RequestBody Employee employee) {
    return employeeRepository.save(employee);
  }

  @GetMapping("/employees/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
    Employee employee =
        employeeRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException((" Employee Does not Exist: " + id)));
    return ResponseEntity.ok(employee);
  }

  @PutMapping("/employees/{id}")
  public ResponseEntity<Employee> updateEmployeeById(
      @PathVariable Long id, @RequestBody Employee employee) {
    Employee existingEmployee =
        employeeRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException((" Employee Does not Exist: " + id)));
    existingEmployee.setFirstName(employee.getFirstName());
    existingEmployee.setLastName(employee.getLastName());
    existingEmployee.setEmailId(employee.getEmailId());
    Employee updatedEmployee = employeeRepository.save(existingEmployee);
    return ResponseEntity.ok(updatedEmployee);
  }

  @DeleteMapping("/employees/{id}")
  public ResponseEntity<Map<String, Boolean>> deleteEmployeeById(@PathVariable Long id) {
    Employee employee =
        employeeRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException((" Employee Does not Exist: " + id)));
    employeeRepository.delete(employee);
    Map<String, Boolean > response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }


}
