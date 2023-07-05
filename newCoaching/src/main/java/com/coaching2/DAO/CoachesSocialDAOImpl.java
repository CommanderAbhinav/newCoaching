package com.coaching2.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coaching2.model.CoachesSocial;

@Repository
public class CoachesSocialDAOImpl implements CoachesSocialDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveCoachSocial(CoachesSocial coachSocial) {
		Object[] sqlParameters = { coachSocial.getCoach_db_id(),coachSocial.getType(),coachSocial.getLink()};

		String sql = "Insert into CoachesStep2Social(coach_db_id,type,link) values(?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);

		
	}

}
