package com.coaching2.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coaching2.model.Coach;

import com.coaching2.rowMapper.CoachRowMapper;

@Repository
public class CoachManagementDAOImpl implements CoachManagementDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveCoach(Coach coachData) {
         Object[] sqlParameters= {coachData.getName(),coachData.getEmail(),coachData.getPassword()};
		 
		 String sql="Insert into Coaches(name,email,password) values(?,?,?)";
		 
		 jdbcTemplate.update(sql,sqlParameters);
		 
		 System.out.println("1 coach record saved");

	}

	@Override
	public Coach getCoachById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ifEmailIsPresent(String email) {
		
		     String sql = "SELECT COUNT(*) FROM COACHES WHERE email = ?";
	        int count = jdbcTemplate.queryForObject(sql, Integer.class, email);
	        return count > 0;
	}

}
