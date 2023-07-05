package com.coaching2.DTO;

public class CoacheeDTO {
    private int id = 0;
    private String name;
    private String email;
    private String password;
    private boolean verified;
    private String code;

    private CoacheeDTO() {
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
        private CoacheeDTO coacheeDTO;

        public Builder() {
            coacheeDTO = new CoacheeDTO();
        }

        public Builder withId(int id) {
            coacheeDTO.id = id;
            return this;
        }

        public Builder withName(String name) {
            coacheeDTO.name = name;
            return this;
        }

        public Builder withEmail(String email) {
            coacheeDTO.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            coacheeDTO.password = password;
            return this;
        }

        public Builder withVerified(boolean verified) {
            coacheeDTO.verified = verified;
            return this;
        }

        public Builder withCode(String code) {
            coacheeDTO.code = code;
            return this;
        }

        public CoacheeDTO build() {
            return coacheeDTO;
        }
    }
}