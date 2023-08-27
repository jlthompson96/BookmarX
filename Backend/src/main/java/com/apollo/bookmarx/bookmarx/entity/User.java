package com.apollo.bookmarx.bookmarx.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
    @Data
    @Document
    public class User{
        @Id
        private String id;
        private String firstName;
        private String lastName;
        private String emailAddress;
        private int age;
        private List<String> favoriteBooks;
        private List<String> favoriteGenres;

        public User(String firstName, String lastName, String emailAddress, int age, List<String> favoriteBooks, List<String> favoriteGenres) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailAddress = emailAddress;
            this.age = age;
            this.favoriteBooks = favoriteBooks;
            this.favoriteGenres = favoriteGenres;
        }
    }
