package com.coaching2.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.coaching2.DAO.CoachManagementDAO;
import com.coaching2.DAO.CoacheeManagementDAO;
import com.coaching2.util.JwtTokenUtil;

@Service
public class VerificationService {

	@Autowired
	private CoachManagementDAO coachManagementDAO;

	@Autowired
	private CoacheeManagementDAO coacheeManagementDAO;

	public  ResponseEntity<?> matchCodeCoach(String emailId, String code) {
		String ActualCode = coachManagementDAO.getCodeCoach(emailId);
		if (ActualCode.equals(code)) {

			String token = JwtTokenUtil.generateToken(emailId, "coach");
			return ResponseEntity.ok(token);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Verification Failed,Wrong Code.");

	}

	public  ResponseEntity<?> matchCodeCoachee(String emailId, String code) {
		String ActualCode = coacheeManagementDAO.getCodeCoachee(emailId);
		if (ActualCode == code) {
			String token = JwtTokenUtil.generateToken(emailId, "coachee");

			return ResponseEntity.ok().body(token);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Verification Failed,Wrong Code.");
	}

}
