package com.coaching2.model;

import java.time.LocalDate;

public class CoachesEdu {
	private int id;
	private int coach_db_id;
	private String schoolName;
	private String degree;
	private String specialisation;
	private LocalDate from;
	private LocalDate to;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCoach_db_id() {
		return coach_db_id;
	}

	public void setCoach_db_id(int coach_db_id) {
		this.coach_db_id = coach_db_id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}
}
