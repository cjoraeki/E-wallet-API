package com.example.ewalletapi.services;

import com.example.ewalletapi.dto.requestdto.MailDto;
import com.example.ewalletapi.dto.responsedto.ApiResponse;

public interface EmailServices {
    ApiResponse<MailDto> sendEmail(MailDto mailDto);
}
