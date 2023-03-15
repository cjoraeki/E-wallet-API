package com.example.ewalletapi.dto.responsedto;

import com.example.ewalletapi.dto.paystack.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionResponseDto {
    private String id;
    private String reference;
    private String domain;
    private String source;
    private String transactionType;
    private String status;
    private String message;
    private String description; //for webhook response
    private String request_code; //for webhook response
    private Customer customer; //for webhook response
    private boolean paid; //for webhook response
    private BigDecimal amount;
    private String gateway_response;
    private String channel;
    private String currency;
    private String ip_address;

    private String integration;
    private String reason;
    private String transfer_code;
}
