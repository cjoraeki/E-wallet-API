package com.example.ewalletapi.dto.paystack;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDto {
    @Schema(example = "nuban")
    private String type;

    private String account_name;

    @Schema(example = "John Doe")
    private String name;

    @Schema(example = "0001234567")
    private String account_number;

    @Schema(example = "011 for First bank")
    private String bank_code;

    @Schema(example = "NGN")
    private String currency;

    private String bank_id;
}
