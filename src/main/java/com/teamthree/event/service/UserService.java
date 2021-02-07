package com.teamthree.event.service;

import com.teamthree.event.dto.UserViewDto;

import java.util.List;

public interface UserService {
    List<UserViewDto> getAll();
}
