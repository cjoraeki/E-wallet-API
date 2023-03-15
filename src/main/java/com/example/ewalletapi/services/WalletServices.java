package com.example.ewalletapi.services;

import com.example.ewalletapi.dto.responsedto.WalletResponseDto;

import java.math.BigDecimal;

public interface WalletServices {
    WalletResponseDto updateWallet(String email, BigDecimal amount);
}
