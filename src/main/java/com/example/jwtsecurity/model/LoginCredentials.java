package com.example.jwtsecurity.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginCredentials {

    private String email;
    private String password;

}
