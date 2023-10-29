package com.thompson.bookmarx.services;

import com.thompson.bookmarx.entities.UserEntity;
import com.thompson.bookmarx.repositories.UserRepository;
import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getUserList(){
        try {
            log.info("---- Entering getUserList() ----");
            log.info(userRepository.findAll().toString());
            return userRepository.findAll();
        } catch (Exception e) {
            log.error("---- Error in getUserList() ----");
            log.error(e.getMessage());
            return Collections.emptyList();
        }
    }
}
