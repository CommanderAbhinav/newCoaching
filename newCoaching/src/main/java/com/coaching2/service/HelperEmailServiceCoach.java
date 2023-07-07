package com.coaching2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.coaching2.DAO.CoachManagementDAO;
import com.coaching2.DAO.CoachManagementDAOImpl;
import com.coaching2.DAO.CoacheeManagementDAO;
import com.coaching2.model.Coach;
import com.coaching2.model.Coachee;

@Service

public class HelperEmailServiceCoach {
   
	@Autowired
	@Lazy
	private EmailService emailService;

	@Autowired
	private CoachManagementDAO coachManagementDAO ;

	@Autowired
	@Lazy
	private VerificationCodeService verificationCodeService;

	public void registerUser(Coach coachData) {

		String verificationCode = verificationCodeService.generateVerificationCode();
		

		coachData.setCode(verificationCode);
		
		coachManagementDAO.updateCoach(coachData);

		emailService.sendVerificationCode(coachData.getEmail(), verificationCode);
	}
}
