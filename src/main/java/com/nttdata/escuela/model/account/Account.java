package com.nttdata.escuela.model.account;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public abstract class Account {
    private Integer id;
    private String numberAccount;
    private Boolean freeComission;
    private Boolean limitTransfer;
    private Integer clientId;
    private BigDecimal balance;
}
