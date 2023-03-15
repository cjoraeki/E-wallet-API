package com.example.ewalletapi.dto.responsedto;

import com.example.ewalletapi.dto.paystack.BankDto;
import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankListApiResponseDto {
    private String message;
    private boolean status;
    private List<BankDto> data;
}
