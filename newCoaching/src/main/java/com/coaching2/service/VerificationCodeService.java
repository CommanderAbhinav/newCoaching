package com.coaching2.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class VerificationCodeService {

	public String generateVerificationCode() {

		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int length = 6;
		StringBuilder verificationCode = new StringBuilder();

		Random random = new Random();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			verificationCode.append(characters.charAt(index));
		}

		return verificationCode.toString();
	}
}
