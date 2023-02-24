package com.khaledamin.mawardyrestapi.userauthentication;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users", schema = "mawredy", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "user_email"}))
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", columnDefinition = "BIGINT")
    private long id;
    @Column(name = "user_email", columnDefinition = "VARCHAR(225)")
    private String email;
    @Column(name = "user_password", columnDefinition = "VARCHAR(225)")
    private String password;

}
