package com.example.ewalletapi.services;

import com.example.ewalletapi.dto.paystack.AccountDto;
import com.example.ewalletapi.dto.paystack.BankDto;
import com.example.ewalletapi.dto.paystack.FundTransferDto;
import com.example.ewalletapi.dto.paystack.InitiateTransactionDto;
import com.example.ewalletapi.dto.responsedto.ApiResponse;
import com.example.ewalletapi.dto.responsedto.TransactionResponseDto;

import java.util.List;

public interface PaymentServices {
    ApiResponse<List<BankDto>> fetchBanks(String currency, String type);

    ApiResponse<String> getPaymentLink(InitiateTransactionDto transactionDto);

    ApiResponse<TransactionResponseDto> verifyTransaction(String paymentReference);

    ApiResponse<AccountDto> getAccountDetails(String accountNumber, String bankCode);

    ApiResponse<FundTransferDto> createTransferRecipient(AccountDto accountDto);

    ApiResponse<TransactionResponseDto> initiateTransfer(FundTransferDto fundTransferDto);
}
