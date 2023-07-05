package com.coaching2.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coaching2.model.CoachAboutMe;

@Repository
public class CoachStep1DAOImpl implements CoachStep1DAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public void saveCoachAboutMe(CoachAboutMe coachAboutMe) {
		Object[] sqlParameters = { coachAboutMe.getCoach_db_id(),coachAboutMe.getImage(),coachAboutMe.getAbout(),coachAboutMe.getVideo(),coachAboutMe.getCountry(),coachAboutMe.getState(),coachAboutMe.getCity(),coachAboutMe.getGender() };

		String sql = "Insert into CoachesStep1(coach_db_id,image,about,video,country,state,city,gender) values(?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);

		
	}


	@Override
	public void updateTitle(int coach_id, String employeeTitle) {
		String sql = "Update CoachesStep1 SET emplyeeTitle= ? WHERE coach_db_id=?";

		jdbcTemplate.update(sql,employeeTitle,coach_id );
		
	}
    
}
