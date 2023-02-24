package com.khaledamin.mawardyrestapi.userauthentication;

import com.khaledamin.mawardyrestapi.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/V1")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<BaseResponse<UserEntity>> login(@RequestBody UserEntity user) {
        return new ResponseEntity<>(userService.login(user.getEmail(), user.getPassword()), HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<BaseResponse<String>> signup(@RequestBody UserEntity user) {
        return new ResponseEntity<>(userService.signup(user),HttpStatus.OK);
    }
}
