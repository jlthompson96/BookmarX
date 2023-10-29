package com.thompson.bookmarx.controllers;

import com.thompson.bookmarx.entities.UserEntity;
import com.thompson.bookmarx.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class UserControllerTests {

    @InjectMocks
    UserController userController;

    @Mock
    UserService userService;


    @Test
    void test_getUserList() {
        when(userService.getUserList()).thenReturn(new ArrayList<>());
        ResponseEntity<List<UserEntity>> response = userController.getUserList();
        assertNotNull(response);
    }

    @Test
    void test_getUserList_exception() {
        when(userService.getUserList()).thenThrow(new RuntimeException());
        ResponseEntity<List<UserEntity>> response = userController.getUserList();
        assertNotNull(response);
    }
}
