package com.example.jwtauth0126.service.auth;

import com.example.jwtauth0126.dto.ApiResponse;
import com.example.jwtauth0126.dto.AuthRequest;
import com.example.jwtauth0126.dto.AuthResponse;

public interface AuthService {
    ApiResponse<AuthResponse> login(AuthRequest authRequest);
    ApiResponse<String> signUp(AuthRequest authRequest);
}
