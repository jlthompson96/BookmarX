package com.thompson.bookmarx.controllers;

import com.thompson.bookmarx.common.URLs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(URLs.BASE_URL)
public class UserController {

    @GetMapping(URLs.USER_LIST)
    public String userList() {
        return "User List";
    }
}
