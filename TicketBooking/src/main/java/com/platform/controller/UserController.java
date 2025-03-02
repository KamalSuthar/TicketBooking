package com.platform.controller;

import com.platform.entity.User;
import com.platform.request.UserRequest;
import com.platform.response.UserResponse;
import com.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

   @Autowired
   private UserService userService;

   @GetMapping
    public ResponseEntity<UserResponse> getUserDetail(@RequestParam(value="userId") int userId) {
        UserResponse userResponse = userService.getUserById(userId);
        return ResponseEntity.status(HttpStatus.OK).body(userResponse);
    }

    @PostMapping
    public ResponseEntity<User> addUserDetails(@RequestBody UserRequest userRequest) {
        User savedUser = userService.addUser(userRequest);
        return ResponseEntity.ok(savedUser);
    }

}
