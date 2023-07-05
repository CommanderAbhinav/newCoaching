package com.coaching2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.coaching2.DAO.CoacheeManagementDAO;
import com.coaching2.model.Coachee;

@Service
public class HelperEmailService {

	@Autowired
	@Lazy
	private EmailService emailService;

	@Autowired
	private CoacheeManagementDAO coacheeManagementDAO;

	@Autowired
	@Lazy
	private VerificationCodeService verificationCodeService;

	public void registerUser(Coachee coacheeData) {

		String verificationCode = verificationCodeService.generateVerificationCode();

		coacheeData.setCode(verificationCode);
		coacheeManagementDAO.updateCoachee(coacheeData);

		emailService.sendVerificationCode(coacheeData.getEmail(), verificationCode);
	}
}
