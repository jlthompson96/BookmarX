package com.thompson.bookmarx.controllers;

import com.thompson.bookmarx.common.URLs;
import com.thompson.bookmarx.entities.UserEntity;
import com.thompson.bookmarx.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(URLs.BASE_URL)
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(URLs.USER_LIST)
    public ResponseEntity<List<UserEntity>> getUserList(){
        log.info("---- Entering userList() ----");
        return new ResponseEntity<List<UserEntity>>(userService.getUserList(), HttpStatus.OK);
    }
}
