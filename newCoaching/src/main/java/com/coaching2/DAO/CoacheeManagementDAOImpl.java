package com.coaching2.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coaching2.model.Coachee;
import com.coaching2.rowMapper.CoacheeRowMapper;

@Repository
public class CoacheeManagementDAOImpl implements CoacheeManagementDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveCoachee(Coachee coacheeData) {
		Object[] sqlParameters = { coacheeData.getName(), coacheeData.getEmail(), coacheeData.getPassword() };

		String sql = "Insert into coachees(name,email,password) values(?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);

	}

	@Override
	public Coachee getCoacheeById(int id) {

		return null;
	}

	@Override
	public boolean ifEmailIsPresent(String email) {

		String sql = "SELECT COUNT(*) FROM COACHEES WHERE email = ?";
		int count = jdbcTemplate.queryForObject(sql, Integer.class, email);
		return count > 0;

	}

	@Override
	public void updateCoachee(Coachee coacheeData) {

		String sql = "Update coachees SET code= ? WHERE email=?";

		jdbcTemplate.update(sql, coacheeData.getCode(), coacheeData.getEmail());

	}

	@Override
	public String getCodeCoachee(String emailId) {
		String sql = "SELECT code FROM Coachees WHERE email = ?";
        String Code= jdbcTemplate.queryForObject(sql, String.class, emailId);
	    return Code;
	}

}
