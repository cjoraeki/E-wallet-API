package com.example.ewalletapi.dto.paystack;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferRecipientDto {
    private String id;
    private boolean active;
    private String name;
    private String recipient_code;
    private String domain;
    private String integration;
    private String type;
    private Date createdAt;
    private Date updatedAt;
    private boolean is_deleted;
    private AccountDto details;
}
