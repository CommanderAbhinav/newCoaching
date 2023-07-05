package com.coaching2.model;

public class CoachesSocial {
	private int id;
	private int coach_db_id;
	private String type;
	private String link;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
