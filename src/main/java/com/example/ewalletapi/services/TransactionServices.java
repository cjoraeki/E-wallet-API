package com.example.ewalletapi.services;

import com.example.ewalletapi.dto.responsedto.TransactionResponseDto;

public interface TransactionServices {
    TransactionResponseDto logTransaction(TransactionResponseDto transactionResponseDto);
}
