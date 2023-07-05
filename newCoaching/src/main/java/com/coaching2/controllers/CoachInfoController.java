package com.coaching2.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coaching2.model.CoachAboutMe;
import com.coaching2.model.CoachesEdu;
import com.coaching2.model.CoachesSocial;
import com.coaching2.model.CoachesWork;
import com.coaching2.service.CoachSignUpService;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class CoachInfoController {

	 private static final ch.qos.logback.classic.Logger logger =
		        (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(CoachInfoController.class);

	@Autowired
	private CoachSignUpService coachSignUpService;

	@PostMapping("/user/coachStep1")
	public ResponseEntity<?> InfoStep1(HttpServletRequest request, @RequestBody CoachAboutMe coachAboutMe) {
		String userId = (String) request.getAttribute("userId");
		logger.info("Coach with " + userId + " saved Step1 Data");
		return coachSignUpService.saveStep1(userId, coachAboutMe);
	}

	@PostMapping("/coachStep2")
	public ResponseEntity<?> saveCoachesDetails(HttpServletRequest request,
			@RequestBody CoachesSocial[] coachesSocialArray,
			@RequestBody CoachesEdu[] coachesEduArray, @RequestBody String EmployeeTitle,
			@RequestBody CoachesWork[] coachesWorkArray) {
		String userId = (String) request.getAttribute("userId");
		logger.info("Coach with " + userId + " saved Step2 Data");
		return coachSignUpService.saveStep2(userId, coachesSocialArray, coachesEduArray, EmployeeTitle,
				coachesWorkArray);
	}

}
