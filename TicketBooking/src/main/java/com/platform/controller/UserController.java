package com.platform.controller;

import com.platform.response.UserResponse;
import com.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

   @Autowired
   private UserService userService;

    /*@GetMapping
    public String testApi() {
        return "API is working!";
    }*/

   @GetMapping("/users")
    public ResponseEntity<UserResponse> getUserDetail(@RequestParam(value="userId") String userId) {
        System.out.println("Enter");
        UserResponse userResponse = userService.getUserById(Integer.valueOf(userId));
        System.out.println("Exit");
        return ResponseEntity.status(HttpStatus.OK).body(userResponse);
    }

}
