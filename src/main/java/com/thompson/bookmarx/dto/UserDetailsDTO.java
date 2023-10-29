package com.thompson.bookmarx.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserDetailsDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private List<String> favoriteBooks;
    private List<String> favoriteGenres;
}
