package com.coaching2.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.coaching2.model.Coachee;

public class CoacheeRowMapper implements RowMapper<Coachee>{

	@Override
	public Coachee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Coachee userData=new Coachee();
		
		userData.setId(rs.getInt("id"));
		userData.setName(rs.getString("name"));
		userData.setEmail(rs.getString("email"));
		userData.setPassword(rs.getString("password"));
		
		return userData;
	}
         
}
