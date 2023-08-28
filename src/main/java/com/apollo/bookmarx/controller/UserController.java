package com.apollo.bookmarx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/api/v1/getUsers")
    public String getListOfUsers(){
        return "test";
    }
}
