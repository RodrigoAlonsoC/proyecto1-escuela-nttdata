package com.nttdata.escuela.model.account;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FixedTermAccount extends Account{
    private BigDecimal maxTranfer;

    public FixedTermAccount(Integer id, String numberAccount, Boolean freeComission, Boolean limitTransfer, Integer clientId, BigDecimal balance, BigDecimal maxTransfer){
        super(id, numberAccount, freeComission, limitTransfer, clientId, balance);
        this.maxTranfer = maxTransfer;
    }
}
