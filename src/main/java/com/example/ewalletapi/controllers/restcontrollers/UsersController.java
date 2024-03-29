package com.example.ewalletapi.controllers.restcontrollers;


import com.example.ewalletapi.dto.requestdto.ChangePasswordDto;
import com.example.ewalletapi.dto.responsedto.ApiResponse;
import com.example.ewalletapi.dto.responsedto.UserResponseDto;
import com.example.ewalletapi.exceptions.AuthenticationException;
import com.example.ewalletapi.services.UserServices;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users/")
public class UsersController {
    private final UserServices userServices;


    @Operation(summary = "Updates a logged in user password, generates a new Bearer token and blacklists the old token")
    @PostMapping("/update-password")
    public ResponseEntity<ApiResponse<UserResponseDto>> updatePassword(@RequestBody ChangePasswordDto changePasswordDto, @RequestHeader("Authorization") String token) {
        if (token.startsWith("Bearer")) {
            token = token.replace("Bearer", "").replace("\\s", "");
        } else throw new AuthenticationException("Invalid access token. Pls ensure token starts with 'Bearer '");
        changePasswordDto.setVerificationToken(token);
        return ResponseEntity.ok(new ApiResponse<>("Password updated",true, userServices.updatePassword(changePasswordDto)));
    }

    @Operation(summary = "Blacklists the users token")
    @GetMapping("/logout")
    public ResponseEntity<ApiResponse<String>> logout(@RequestHeader("Authorization") String token) {
        return ResponseEntity.ok(new ApiResponse<>(userServices.logout(token), true, null));
    }

}
