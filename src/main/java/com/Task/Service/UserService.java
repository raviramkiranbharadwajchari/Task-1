package com.Task.Service;

public interface UserService {
    void registerUser(String email);
    boolean verifyOTP(String email, String otp);
}
