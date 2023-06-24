package com.coaching2.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.coaching2.model.Coach;

public class CoachRowMapper implements RowMapper<Coach> {

	@Override
	public Coach mapRow(ResultSet rs, int rowNum) throws SQLException {
         Coach userData=new Coach();
		
		userData.setId(rs.getInt("id"));
		userData.setName(rs.getString("name"));
		userData.setEmail(rs.getString("email"));
		userData.setPassword(rs.getString("password"));
		
		return userData;

	}

}
