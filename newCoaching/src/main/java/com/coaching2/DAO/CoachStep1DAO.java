package com.coaching2.DAO;

import com.coaching2.model.CoachAboutMe;

public interface CoachStep1DAO {
    
	void saveCoachAboutMe(CoachAboutMe coachAboutMe);
	
	void updateTitle(int coach_id,String employeeTitle);
}
