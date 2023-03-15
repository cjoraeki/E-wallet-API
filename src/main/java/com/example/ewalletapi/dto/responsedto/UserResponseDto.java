package com.example.ewalletapi.dto.responsedto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import java.util.Date;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private String uuid;

    private String firstName;

    private String lastName;

    private String walletUUId;

    private Date lastLoginDate;

    private String email;

    private String country;

    private String state;

    private String homeAddress;

    private String phoneNumber;
    private String token;
}
