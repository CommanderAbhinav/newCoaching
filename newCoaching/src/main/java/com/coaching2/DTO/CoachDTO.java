package com.coaching2.DTO;

public class CoachDTO {
	private int id;
	private String name;
	private String email;
	private String password;
	private boolean verified;
	private String code;

	private CoachDTO(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.email = builder.email;
		this.password = builder.password;
		this.verified = builder.verified;
		this.code = builder.code;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public boolean isVerified() {
		return verified;
	}

	public String getCode() {
		return code;
	}

	public static class Builder {
		private int id = 0;
		private String name;
		private String email;
		private String password;
		private boolean verified;
		private String code;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Builder verified(boolean verified) {
			this.verified = verified;
			return this;
		}

		public Builder code(String code) {
			this.code = code;
			return this;
		}

		public CoachDTO build() {
			return new CoachDTO(this);
		}
	}
}
