package com.example.ewalletapi.services;

import com.example.ewalletapi.dto.requestdto.ActivateUserDto;
import com.example.ewalletapi.dto.requestdto.ChangePasswordDto;
import com.example.ewalletapi.dto.requestdto.UserLoginDto;
import com.example.ewalletapi.dto.requestdto.UserSignUpDto;
import com.example.ewalletapi.dto.responsedto.UserResponseDto;

public interface UserServices {
    UserResponseDto signup(UserSignUpDto userDto);

    String sendToken(String userEmail, String mailSubject);

    UserResponseDto activateUser(ActivateUserDto activateUserDto);

    UserResponseDto login(UserLoginDto userLoginDto);

//    String forgotPassword(String email);

    String resetPassword(ChangePasswordDto changePasswordDto);

    String logout(String token);

    UserResponseDto updatePassword(ChangePasswordDto changePasswordDto);
}
