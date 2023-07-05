package com.coaching2.DTO;

public class CoachesSocialDTO {
    private int id;
    private int coach_db_id;
    private String type;
    private String link;

    private CoachesSocialDTO(Builder builder) {
        this.id = builder.id;
        this.coach_db_id = builder.coach_db_id;
        this.type = builder.type;
        this.link = builder.link;
    }

    public int getId() {
        return id;
    }

    public int getCoach_db_id() {
        return coach_db_id;
    }

    public String getType() {
        return type;
    }

    public String getLink() {
        return link;
    }

    public static class Builder {
        private int id;
        private int coach_db_id;
        private String type;
        private String link;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder coach_db_id(int coach_db_id) {
            this.coach_db_id = coach_db_id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder link(String link) {
            this.link = link;
            return this;
        }

        public CoachesSocialDTO build() {
            return new CoachesSocialDTO(this);
        }
    }
}
