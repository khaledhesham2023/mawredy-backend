package com.khaledamin.mawardyrestapi.userauthentication;

import com.khaledamin.mawardyrestapi.BaseResponse;
import org.apache.catalina.User;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public BaseResponse<UserEntity> login(String userEmail, String userPassword) {
        UserEntity user = userRepo.login(userEmail, userPassword);
        if (user == null) {
            return new BaseResponse<>(false, "E-mail or Password is incorrect", null);
        } else {
            return new BaseResponse<>(true, "Signed in Successfully", user);
        }
    }

    public BaseResponse<String> signup(UserEntity user) {
        UserEntity user2 = userRepo.login(user.getEmail(), user.getPassword());
        if (user2 != null && user2.getEmail().equals(user.getEmail())) {
            return new BaseResponse<>(false, "E-mail already exists");
        } else {
            userRepo.save(user);
            return new BaseResponse<>(true, "E-mail created successfully");
        }
    }
}






