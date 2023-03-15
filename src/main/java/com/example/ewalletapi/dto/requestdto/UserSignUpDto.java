package com.example.ewalletapi.dto.requestdto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpDto {
    @NotNull @Schema(example = "Carl")
    private String firstName;

    @NotNull @Schema(example = "Smith")
    private String lastName;

    @NotNull
    @Schema(example = "cjoraeki@yahoo.com")
    private String email;

    @NotNull @Schema(example = "Nigeria")
    private String country;

    @NotNull @Schema(example = "Lagos")
    private String state;

    @NotNull @Schema(example = "1 Crystal Street, Crusader Avenue")
    private String homeAddress;

    @NotNull @Schema(example = "0000")
    private String password;

    @NotNull @Schema(example = "07062126363")
    private String phoneNumber;
}
