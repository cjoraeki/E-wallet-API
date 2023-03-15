package com.example.ewalletapi.dto.paystack;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class BankDto {
    private String id;

    private String name;

    private String code;

    private boolean active;

    private String country;

    private String currency;

    private String type;

    private boolean is_deleted;

}
