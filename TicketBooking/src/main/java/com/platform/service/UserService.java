package com.platform.service;

import com.platform.entity.Users;
import com.platform.repository.UserRepo;
import com.platform.response.UserResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper mapper;

    public UserResponse getUserById(Integer id) {
        Optional<Users> user = userRepo.findById(id);
        UserResponse userResponse = mapper.map(user, UserResponse.class);
        return userResponse;
    }

}
