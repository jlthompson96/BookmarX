package com.thompson.bookmarx.repositories;

import com.thompson.bookmarx.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
