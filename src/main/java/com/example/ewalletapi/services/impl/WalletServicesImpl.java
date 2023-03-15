package com.example.ewalletapi.services.impl;

import com.example.ewalletapi.dto.responsedto.WalletResponseDto;
import com.example.ewalletapi.model.Wallet;
import com.example.ewalletapi.repository.WalletRepository;
import com.example.ewalletapi.services.WalletServices;
import com.example.ewalletapi.utils.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class WalletServicesImpl implements WalletServices {
    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private AppUtil appUtil;
    @Override
    public WalletResponseDto updateWallet(String email, BigDecimal amount) {

        Wallet wallet = walletRepository.findByEmail(email)
                .orElse(Wallet.builder()
                        .walletUUID(appUtil.generateSerialNumber("0"))
                        .balance(BigDecimal.ZERO)
                        .email(email)
                        .build());
        wallet.setBalance(wallet.getBalance().add(amount));
        wallet.setUpdatedAt();

        return appUtil.getMapper().convertValue(walletRepository.save(wallet), WalletResponseDto.class);
    }
}
