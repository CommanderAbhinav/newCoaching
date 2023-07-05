package com.coaching2.DTO;

import java.time.LocalDate;

public class CoachesEduDTO {
	private int id;
	private int coachDbId;
	private String schoolName;
	private String degree;
	private String specialisation;
	private LocalDate from;
	private LocalDate to;

	private CoachesEduDTO(Builder builder) {
		this.id = builder.id;
		this.coachDbId = builder.coachDbId;
		this.schoolName = builder.schoolName;
		this.degree = builder.degree;
		this.specialisation = builder.specialisation;
		this.from = builder.from;
		this.to = builder.to;
	}

	public int getId() {
		return id;
	}

	public int getCoachDbId() {
		return coachDbId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public String getDegree() {
		return degree;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}

	public static class Builder {
		private int id;
		private int coachDbId;
		private String schoolName;
		private String degree;
		private String specialisation;
		private LocalDate from;
		private LocalDate to;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder coachDbId(int coachDbId) {
			this.coachDbId = coachDbId;
			return this;
		}

		public Builder schoolName(String schoolName) {
			this.schoolName = schoolName;
			return this;
		}

		public Builder degree(String degree) {
			this.degree = degree;
			return this;
		}

		public Builder specialisation(String specialisation) {
			this.specialisation = specialisation;
			return this;
		}

		public Builder from(LocalDate from) {
			this.from = from;
			return this;
		}

		public Builder to(LocalDate to) {
			this.to = to;
			return this;
		}

		public CoachesEduDTO build() {
			return new CoachesEduDTO(this);
		}
	}
}
