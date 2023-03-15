package com.example.ewalletapi.services.impl;

import com.example.ewalletapi.dto.requestdto.MailDto;
import com.example.ewalletapi.dto.responsedto.ApiResponse;
import com.example.ewalletapi.exceptions.MailSendingException;
import com.example.ewalletapi.services.EmailServices;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailServicesImpl implements EmailServices {
    private final JavaMailSender mailSender;
    private final Logger logger = LoggerFactory.getLogger(EmailServicesImpl.class);
    @Override
    public ApiResponse<MailDto> sendEmail(MailDto mailDto) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("no-relpy-ewallet@gmail.com");
        simpleMailMessage.setTo(mailDto.getTo());
        simpleMailMessage.setSubject(mailDto.getSubject());
        simpleMailMessage.setText(mailDto.getMessage());

        try {
            mailSender.send(simpleMailMessage);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new MailSendingException(ex.getMessage());
        }

        logger.info("Email sent successfully to {}",mailDto.getTo());

        return new ApiResponse<>("Email sent successfully", true, mailDto);
    }

    public static void main(String[] args) {

    }
}
