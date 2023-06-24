package com.coaching2.DAO;

import com.coaching2.model.Coachee;

public interface CoacheeManagementDAO {
    void saveCoachee(Coachee coachee);
    
    Coachee getCoacheeById(int id);
    	

}
