package com.thompson.bookmarx.controllers;

import com.thompson.bookmarx.common.URLs;
import com.thompson.bookmarx.entities.UserEntity;
import com.thompson.bookmarx.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:5173"})
@Slf4j
@RestController
@RequestMapping(URLs.BASE_URL)
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(URLs.USER_LIST)
    public ResponseEntity<List<UserEntity>> getUserList() {
        log.info("---- Entering userList() ----");
        try {
            return new ResponseEntity<>(userService.getUserList(), HttpStatus.OK);
        } catch (Exception e) {
            log.error("---- Error in userList() ----");
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(URLs.USER_CREATE)
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
        log.info("---- Entering createUser() ----");
        try {
            return new ResponseEntity<>(userService.createUser(userEntity), HttpStatus.OK);
        } catch (Exception e) {
            log.error("---- Error in createUser() ----");
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
