package com.apollo.bookmarx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Controller
public class UserController {
    @GetMapping("/getUsers")
    public String getListOfUsers(){
        return "test";
    }
}
