package com.coaching2.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coaching2.service.VerificationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class VerificationController {
	
	@Autowired
	private VerificationService verificationService;
	
	 private static final ch.qos.logback.classic.Logger logger =
		        (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(VerificationController.class);


	@PostMapping("/coach/verify")
	public ResponseEntity<?> verifyCoach(@RequestParam("email") String userId, @RequestBody String code) {
		
		System.out.println("Aa gaya");
		
		logger.info("userId");

		return verificationService.matchCodeCoach(userId, code);

	}

	@PostMapping("/coachee/verify")
	public ResponseEntity<?> verifyCoachee(@RequestParam("email") String userId, @RequestBody String code) {

		return verificationService.matchCodeCoachee(userId, code);
	}

}
