package com.rj.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rj.jdbc.bean.Employee;
import com.rj.jdbc.dao.EmployeeDao;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao eDao;
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return eDao.findAll();
	}
	
	@GetMapping("/employees/{eid}")
	public Employee findById(@PathVariable Integer eid) {
		return eDao.findById(eid);
	}
	
	@DeleteMapping("/employees/{eid}")
	public String deleteById(@PathVariable Integer eid) {
		return eDao.deleteById(eid)+" Employee(s) delete from the database";
	}
	
	@PostMapping("/employees")
	public String save(@RequestBody Employee e) {
		return eDao.save(e)+" Employee(s) saved successfully";
	}
	
	@PutMapping("/employees/{eid}")
	public String update(@RequestBody Employee e, @PathVariable Integer eid) {
		return eDao.update(e, eid)+" Employee(s) updated successfully";
	}

}
