package com.example.ewalletapi.dto.paystack;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String first_name;
    private String last_name;
    private String email;
    private String customer_code;
    private String phone;
    private String risk_action;
}
