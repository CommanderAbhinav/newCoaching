package com.coaching2.DAO;

import com.coaching2.model.Coach;

public interface CoachManagementDAO {
   
	 void saveCoach(Coach coach);
	    
	    Coach getCoachById(int id);
}
