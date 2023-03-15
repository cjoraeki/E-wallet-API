package com.example.ewalletapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;

@Document("wallet")
@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class Wallet extends Base implements Serializable {
    private static final long serialVersionUID = 2L;

    @Indexed(unique = true)
    private String walletUUID;

    @Indexed(unique = true)
    private String email;

    @Indexed(unique = true)
    private BigDecimal balance;

    public Wallet(){
        super();
    }
}
