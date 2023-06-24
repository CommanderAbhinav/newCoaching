package com.coaching2.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coaching2.model.Coachee;


@Repository
public class CoacheeManagementDAOImpl implements CoacheeManagementDAO {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveCoachee(Coachee coacheeData) {
		 Object[] sqlParameters= {coacheeData.getName(),coacheeData.getEmail(),coacheeData.getPassword()};
		 
		 String sql="Insert into coachees(name,email,password) values(?,?,?)";
		 
		 jdbcTemplate.update(sql,sqlParameters);
		 
		 System.out.println("1 coachee record saved");
	}

	@Override
	public Coachee getCoacheeById(int id) {
		
		return null;
	}

}