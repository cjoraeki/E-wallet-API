package com.example.ewalletapi.dto.paystack;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class InitiateTransactionDto {
    @NotBlank(message = "Provide email address")
    private String email;

    @NotBlank(message = "Amount must be provided and should be specified in Kobo")
    private String amount;

    private String callback_url;

    private Object metadata;
}
