package com.rj.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rj.jdbc.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> findAll() {
		String Query="SELECT * FROM emp_info";
		return jdbcTemplate.query(Query, new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee findById(Integer eid) {
		return jdbcTemplate.queryForObject("SELECT * FROM emp_info WHERE eid=?", new BeanPropertyRowMapper<Employee>(Employee.class), eid);
	}

	@Override
	public int deleteById(Integer eid) {
		return jdbcTemplate.update("DELETE FROM emp_info WHERE eid=?", eid);
	}

	@Override
	public int save(Employee e) {
		return jdbcTemplate.update("INSERT INTO emp_info (desg, ename) VALUES (?, ?)", new Object[] {e.getDesg(), e.getEname()});
	}

	@Override
	public int update(Employee e, Integer eid) {
		return jdbcTemplate.update("UPDATE emp_info SET desg = ?, ename = ? WHERE eid = ?", new Object[] {e.getDesg(), e.getEname(), eid});
	}

}
