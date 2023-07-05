package com.coaching2.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coaching2.model.CoachesWork;

@Repository
public class CoachesWorkDAOImpl implements CoachesWorkDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveCoachWork(CoachesWork coachWork) {
		Object[] sqlParameters = { coachWork.getCoach_db_id(),coachWork.getOrganisation(),coachWork.getTitle(),coachWork.getDescription(),coachWork.getFrom(),coachWork.getTo()};

		String sql = "Insert into CoachesStep2WorkExp(coach_db_id,organisation,title,description,from,to) values(?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);

		
	}

}
