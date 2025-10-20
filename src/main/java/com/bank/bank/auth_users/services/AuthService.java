package com.bank.bank.auth_users.services;

import com.bank.bank.auth_users.dtos.LoginRequest;
import com.bank.bank.auth_users.dtos.LoginResponse;
import com.bank.bank.auth_users.dtos.RegistrationRequest;
import com.bank.bank.auth_users.dtos.ResetPasswordRequest;
import com.bank.bank.res.Response;

public interface AuthService {
    Response<String > register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<? > forgetPassword(String email);
    Response<? > updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
}
