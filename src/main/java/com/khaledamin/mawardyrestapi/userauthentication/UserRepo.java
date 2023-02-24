package com.khaledamin.mawardyrestapi.userauthentication;

import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

    @Query(value = "SELECT * FROM users WHERE user_email = :email AND user_password = :password", nativeQuery = true)
    UserEntity login(@Param("email") String email, @Param("password") String password);



}

