package org.example.builder;

import java.time.LocalDate;

public class User {
    private final String name;
    private final int age;
    private final String address;
    private final String phone;
    private final String email;
    private final boolean isActive;
    private final LocalDate createdAt;

    private User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
        this.isActive = builder.isActive;
        this.createdAt = builder.createdAt;
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;
        private String phone;
        private String email;
        private boolean isActive;
        private LocalDate createdAt;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder isActive(boolean isActive){
            this.isActive = isActive;
            return this;
        }

        public Builder createdAt(LocalDate createdAt){
            this.createdAt = createdAt;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
