package com.coaching2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/")
public class UserController {
	
	@Autowired
     private CoacheeManagementDAO coacheeManagementDAO;
	
	@Autowired
    private CoachManagementDAO coachManagementDAO;
	
	@PostMapping("/coacheeSignUp")
	public ResponseEntity<?> signUpInfo(@RequestBody Coachee coacheeData ) {
		
		boolean UserPresent=coacheeManagementDAO.ifEmailIsPresent(coacheeData.getEmail());
		if(UserPresent !=false) {
			System.out.println("Already in Use");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		coacheeManagementDAO.saveCoachee(coacheeData);
		System.out.println(coacheeData.getName());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/coachSignUp")
	public ResponseEntity<?> signUpInfocoach(@RequestBody Coach coachData ) {
		
		boolean UserPresent=coachManagementDAO.ifEmailIsPresent(coachData.getEmail());
		if(UserPresent !=false) {
			System.out.println("Present Already");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		coachManagementDAO.saveCoach(coachData);
		System.out.println(coachData.getName());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}
