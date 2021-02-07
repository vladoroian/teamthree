package com.teamthree.event.service.impl;

import com.teamthree.event.dto.UserViewDto;
import com.teamthree.event.repository.UserRepository;
import com.teamthree.event.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<UserViewDto> getAll() {
        List<UserViewDto> userList = new ArrayList<>();
        userRepository.findAll()
                .forEach(user -> userList.add(new UserViewDto(user.getId(),user.getFirstName(), user.getLastName(), user.getEmail())));
        return userList;
    }
}
