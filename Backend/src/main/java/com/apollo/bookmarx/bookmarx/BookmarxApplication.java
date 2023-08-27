package com.apollo.bookmarx.bookmarx;

import com.apollo.bookmarx.bookmarx.entity.User;
import com.apollo.bookmarx.bookmarx.respositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class BookmarxApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmarxApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(UserRepository repository) {
//        return args -> {
//            User user = new User(
//                    "Second",
//                    "User",
//                    "second.user@email.com",
//                    30,
//                    List.of("Harry Potter", "The Expanse"),
//                    List.of("Sci-Fi", "Fantasy")
//            );
//
//            repository.insert(user);
//        };
//    }

}
