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
	


	public CoachManagementDAOImpl() {
		super();
		System.out.println("Request Came");
	}

	@Override
	public void saveCoach(Coach coachData) {
		Object[] sqlParameters = { coachData.getName(), coachData.getEmail(), coachData.getPassword() };

		String sql = "Insert into Coaches(name,email,password) values(?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);

		System.out.println("1 coach record saved");

	}

	@Override
	public Coach getCoachById(int id) {
		 String sql="SELECT * FROM coaches WHERE id = ?";
		 Coach coach=jdbcTemplate.queryForObject(sql, new Object[]{id}, new CoachRowMapper());
		return coach;
	}

	@Override
	public boolean ifEmailIsPresent(String email) {

		String sql = "SELECT COUNT(*) FROM COACHES WHERE email = ?";
		int count = jdbcTemplate.queryForObject(sql, Integer.class, email);
		return count > 0;
	}

	@Override
	public void updateCoach(Coach coachData) {
		String sql = "Update coaches SET code= ? WHERE email=?";

		jdbcTemplate.update(sql, coachData.getCode(), coachData.getEmail());
		
	}

	@Override
	public String getCodeCoach(String emailId) {
		String sql = "SELECT code FROM Coaches WHERE email = ?";
        String Code= jdbcTemplate.queryForObject(sql, String.class, emailId);
	    return Code;
	}

	@Override
	public int getIdCoach(String emailId) {
		String sql = "SELECT id FROM Coaches WHERE email = ?";
        int coach_db_id= jdbcTemplate.queryForObject(sql, int.class,emailId);
	    return coach_db_id;
	}
	
	@Override
	public Coach getCoachByEmail(String email) {
		 String sql="SELECT * FROM coaches WHERE email = ?";
		 Coach coach=jdbcTemplate.queryForObject(sql, new Object[]{email}, new CoachRowMapper());
		return coach;
	}

}
