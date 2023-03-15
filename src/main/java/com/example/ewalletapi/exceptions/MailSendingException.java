package com.example.ewalletapi.exceptions;

public class MailSendingException extends RuntimeException{
    public MailSendingException(String errorMessage) {
        super(errorMessage);
    }
}
