package com.teamthree.event.controller;

import com.teamthree.event.dto.UserViewDto;
import com.teamthree.event.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/getAll")
    public List<UserViewDto> getAll() {

        return userService.getAll();
    }
}