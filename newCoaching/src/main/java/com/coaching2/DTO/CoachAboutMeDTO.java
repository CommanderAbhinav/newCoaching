package com.coaching2.DTO;

import java.sql.Blob;

public class CoachAboutMeDTO {
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

	private CoachAboutMeDTO(Builder builder) {
		this.id = builder.id;
		this.coach_db_id = builder.coach_db_id;
		this.image = builder.image;
		this.about = builder.about;
		this.video = builder.video;
		this.country = builder.country;
		this.state = builder.state;
		this.city = builder.city;
		this.gender = builder.gender;
		this.employeeTitle = builder.employeeTitle;
	}

	public int getId() {
		return id;
	}

	public int getCoach_db_id() {
		return coach_db_id;
	}

	public Blob getImage() {
		return image;
	}

	public String getAbout() {
		return about;
	}

	public Blob getVideo() {
		return video;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getGender() {
		return gender;
	}

	public String getEmployeeTitle() {
		return employeeTitle;
	}

	public static class Builder {
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

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder coach_db_id(int coach_db_id) {
			this.coach_db_id = coach_db_id;
			return this;
		}

		public Builder image(Blob image) {
			this.image = image;
			return this;
		}

		public Builder about(String about) {
			this.about = about;
			return this;
		}

		public Builder video(Blob video) {
			this.video = video;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public Builder state(String state) {
			this.state = state;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder employeeTitle(String employeeTitle) {
			this.employeeTitle = employeeTitle;
			return this;
		}

		public CoachAboutMeDTO build() {
			return new CoachAboutMeDTO(this);
		}
	}
}
