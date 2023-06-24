package com.coaching2.DAO;

import com.coaching2.model.Coachee;

public interface CoacheeManagementDAO {
    void saveCoachee(Coachee coachee);
    
    boolean ifEmailIsPresent(String email);
    
    Coachee getCoacheeById(int id);
    	

}
