package com.example.ewalletapi.services.impl;

import com.example.ewalletapi.dto.responsedto.TransactionResponseDto;
import com.example.ewalletapi.model.Transactions;
import com.example.ewalletapi.repository.TransactionRepository;
import com.example.ewalletapi.services.TransactionServices;
import com.example.ewalletapi.utils.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionServiceImpl implements TransactionServices {
    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AppUtil appUtil;

    @Override
    public TransactionResponseDto logTransaction(TransactionResponseDto transactionResponseDto) {

        if (!transactionRepository
                .existsByReferenceOrId(transactionResponseDto.getReference(), transactionResponseDto.getId())) {

            Transactions transaction = appUtil.getMapper().convertValue(transactionResponseDto, Transactions.class);
            transaction.setCustomerEmail(transactionResponseDto.getCustomer().getEmail());
            transactionRepository.save(transaction);
        }

        return transactionResponseDto;
    }
}
