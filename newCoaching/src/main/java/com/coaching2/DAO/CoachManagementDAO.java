package com.coaching2.DAO;

import com.coaching2.model.Coach;
import com.coaching2.model.Coachee;

public interface CoachManagementDAO {

	void saveCoach(Coach coach);

	boolean ifEmailIsPresent(String email);

	Coach getCoachById(int id);
	
	void updateCoach(Coach coach);
	
	String getCodeCoach(String emailId);
	
	int getIdCoach(String emailId);

	Coach getCoachByEmail(String email);
}
