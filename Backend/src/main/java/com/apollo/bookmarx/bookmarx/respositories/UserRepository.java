package com.apollo.bookmarx.bookmarx.respositories;

import com.apollo.bookmarx.bookmarx.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
