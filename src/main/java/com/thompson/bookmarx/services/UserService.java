package com.thompson.bookmarx.services;

import com.thompson.bookmarx.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List getUserList(){
        try {
            log.info("---- Entering getUserList() ----");
            return userRepository.findAll();
        } catch (Exception e) {
            log.error("---- Error in getUserList() ----");
            log.error(e.getMessage());
            return null;
        }
    }
}
