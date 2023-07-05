package com.coaching2.DTO;

import java.time.LocalDate;

public class CoachesWorkDTO {
	private int id;
	private int coach_db_id;
	private String organisation;
	private String title;
	private String description;
	private LocalDate from;
	private LocalDate to;

	private CoachesWorkDTO(Builder builder) {
		this.id = builder.id;
		this.coach_db_id = builder.coach_db_id;
		this.organisation = builder.organisation;
		this.title = builder.title;
		this.description = builder.description;
		this.from = builder.from;
		this.to = builder.to;
	}

	public int getId() {
		return id;
	}

	public int getCoach_db_id() {
		return coach_db_id;
	}

	public String getOrganisation() {
		return organisation;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}

	public static class Builder {
		private int id;
		private int coach_db_id;
		private String organisation;
		private String title;
		private String description;
		private LocalDate from;
		private LocalDate to;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder coach_db_id(int coach_db_id) {
			this.coach_db_id = coach_db_id;
			return this;
		}

		public Builder organisation(String organisation) {
			this.organisation = organisation;
			return this;
		}

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
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

		public CoachesWorkDTO build() {
			return new CoachesWorkDTO(this);
		}
	}
}