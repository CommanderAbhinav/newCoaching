package com.coaching2.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coaching2.model.CoachesEdu;

@Repository
public class CoachesEduDAOImpl implements CoachesEduDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveCoachEdu(CoachesEdu coachEdu) {
		Object[] sqlParameters = { coachEdu.getCoach_db_id(),coachEdu.getSchoolName(),coachEdu.getDegree(),coachEdu.getSpecialisation(),coachEdu.getFrom(),coachEdu.getTo()};

		String sql = "Insert into CoachesStep2Education(coach_db_id,schoolName,degree,specialisation,from,to) values(?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);

		
	}

}
