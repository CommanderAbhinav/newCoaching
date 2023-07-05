package com.coaching2.model;

import java.time.LocalDate;

public class CoachesWork {

	private int id;
	private int coach_db_id;
	private String organisation;
	private String title;
	private String description;
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

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
