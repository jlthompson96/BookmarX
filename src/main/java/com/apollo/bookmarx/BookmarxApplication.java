package com.apollo.bookmarx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
