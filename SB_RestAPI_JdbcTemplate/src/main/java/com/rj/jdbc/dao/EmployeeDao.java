package com.rj.jdbc.dao;

import com.rj.jdbc.bean.Employee;
import java.util.List;


public interface EmployeeDao {
	
    public List<Employee> findAll();
	
	public Employee findById(Integer eid);
	
	public int deleteById(Integer eid);
	
	public int save(Employee e);
	
	public int update(Employee e, Integer eid);

}
