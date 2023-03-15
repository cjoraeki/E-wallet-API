package com.example.ewalletapi.dto.requestdto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MailDto {
    private String to;
    private String subject;
    private String message;
}
