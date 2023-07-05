package com.coaching2.model;

import java.sql.Blob;

public class CoachAboutMe {
	private int id;
	private int coach_db_id;
	private Blob image;
	private String about;
	private Blob video;
	private String country;
	private String state;
	private String city;
	private String gender;
	private String employeeTitle;

	public String getEmployeeTitle() {
		return employeeTitle;
	}

	public void setEmployeeTitle(String employeeTitle) {
		this.employeeTitle = employeeTitle;
	}

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

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Blob getVideo() {
		return video;
	}

	public void setVideo(Blob video) {
		this.video = video;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
