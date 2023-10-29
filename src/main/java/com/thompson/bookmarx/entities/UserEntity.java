package com.thompson.bookmarx.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Users")
public class UserEntity {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private List<String> favoriteBooks;
    private List<String> favoriteGenres;
}
