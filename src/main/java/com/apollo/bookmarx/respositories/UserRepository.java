package com.apollo.bookmarx.respositories;

import com.apollo.bookmarx.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
