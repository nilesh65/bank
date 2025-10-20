package com.bank.bank.auth_users.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LoginResponse {

    private String token;
    private List<String> roles;
}
