package com.coaching2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.coaching2.DAO.CoachManagementDAO;
import com.coaching2.DAO.CoachStep1DAO;
import com.coaching2.DAO.CoachesEduDAO;
import com.coaching2.DAO.CoachesSocialDAO;
import com.coaching2.DAO.CoachesWorkDAO;
import com.coaching2.DTO.CoachesEduDTO;
import com.coaching2.DTO.CoachesSocialDTO;
import com.coaching2.model.Coach;
import com.coaching2.model.CoachAboutMe;
import com.coaching2.model.CoachesEdu;
import com.coaching2.model.CoachesSocial;
import com.coaching2.model.CoachesWork;

@Service
public class CoachSignUpService {

	@Autowired
	private CoachManagementDAO coachManagementDAO;

	@Autowired
	private CoachStep1DAO coachStep1DAO;

	@Autowired
	private CoachesWorkDAO coachesWorkDAO;

	@Autowired
	private CoachesEduDAO coachesEduDAO;

	@Autowired
	private CoachesSocialDAO coachesSocialDAO;

	public ResponseEntity<?> saveStep1(String userId, CoachAboutMe coachAboutMe) {
		int coach_id = coachManagementDAO.getIdCoach(userId);
		coachAboutMe.setCoach_db_id(coach_id);
		coachStep1DAO.saveCoachAboutMe(coachAboutMe);

		return ResponseEntity.status(HttpStatus.OK).body("About Me Data saved.");

	}

	public ResponseEntity<?> saveStep2(String userId, CoachesSocial[] coachesSocialArray, CoachesEdu[] coachesEduArray,
		String employeeTitle, CoachesWork[] coachesWorkArray) {
		int coach_id = coachManagementDAO.getIdCoach(userId);
		for (CoachesWork caochWork : coachesWorkArray) {
			caochWork.setCoach_db_id(coach_id);
			coachesWorkDAO.saveCoachWork(caochWork);
		}

		for (CoachesEdu caochEdu : coachesEduArray) {
			caochEdu.setCoach_db_id(coach_id);
			coachesEduDAO.saveCoachEdu(caochEdu);
		}

		for (CoachesSocial caochSocial : coachesSocialArray) {
			caochSocial.setCoach_db_id(coach_id);
			coachesSocialDAO.saveCoachSocial(caochSocial);
		}
        Coach coach=coachManagementDAO.getCoachByEmail(userId);
        coachStep1DAO.updateTitle(coach.getId(), employeeTitle);
		return ResponseEntity.status(HttpStatus.OK).body("All Data of Step 2 saved.");
	}

}
