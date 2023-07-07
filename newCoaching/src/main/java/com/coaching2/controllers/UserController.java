package com.coaching2.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coaching2.DAO.CoachManagementDAO;
import com.coaching2.DAO.CoacheeManagementDAO;
import com.coaching2.model.Coach;
import com.coaching2.model.Coachee;
import com.coaching2.service.HelperEmailService;
import com.coaching2.service.HelperEmailServiceCoach;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class UserController {

	@Autowired
	private CoacheeManagementDAO coacheeManagementDAO;

	@Autowired
	private CoachManagementDAO coachManagementDAO;

	@Autowired
	@Lazy
	private HelperEmailService helperEmailService = new HelperEmailService();
	
	@Autowired
	@Lazy
	private HelperEmailServiceCoach helperEmailServiceCoach = new HelperEmailServiceCoach();

	private static final ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
			.getLogger(UserController.class);

	@PostMapping("/coacheeSignUp")
	public ResponseEntity<?> signUpInfo(@RequestBody Coachee coacheeData) {

		logger.info("Hello, logging!");

		boolean UserPresent = coacheeManagementDAO.ifEmailIsPresent(coacheeData.getEmail());
		if (UserPresent != false) {
			System.out.println("Already in Use");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		coacheeManagementDAO.saveCoachee(coacheeData);
		System.out.println(coacheeData.getName());
		helperEmailService.registerUser(coacheeData);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/coachSignUp")
	public ResponseEntity<?> signUpInfocoach(@RequestBody Coach coachData) {

		logger.info("Hello, logging!");
		System.out.println(coachData.getName());

		boolean UserPresent = coachManagementDAO.ifEmailIsPresent(coachData.getEmail());
		if (UserPresent != false) {
			System.out.println("Present Already");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		coachManagementDAO.saveCoach(coachData);
		System.out.println(coachData.getName());
		helperEmailServiceCoach.registerUser(coachData);

		return new ResponseEntity<>(HttpStatus.OK);
	}

}
