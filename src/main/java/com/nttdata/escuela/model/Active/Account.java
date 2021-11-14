package com.nttdata.escuela.model.Active;

import lombok.AllArgsConstructor;
import lombok.Data;

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
