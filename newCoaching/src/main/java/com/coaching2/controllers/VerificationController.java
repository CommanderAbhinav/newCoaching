package com.coaching2.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
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
	
	 private static final ch.qos.logback.classic.Logger logger =
		        (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(VerificationController.class);


	@PostMapping("/coach/verify")
	public ResponseEntity<?> verifyCoach(@RequestParam("email") String userId, @RequestBody String code) {
		
		logger.info("userId");

		return VerificationService.matchCodeCoach(userId, code);

	}

	@PostMapping("/user/verify")
	public ResponseEntity<?> verifyCoachee(@RequestParam("email") String userId, @RequestBody String code) {

		return VerificationService.matchCodeCoachee(userId, code);
	}

}
