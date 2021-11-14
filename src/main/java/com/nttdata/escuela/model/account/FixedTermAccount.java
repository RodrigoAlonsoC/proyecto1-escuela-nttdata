package com.nttdata.escuela.model.account;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Class FixedTermAccount is a child of Account.
 * Has a LimitTransfer: true
 * Has a FreeComission: true
 * Required a maximum quantity represent with MaxTranfer.
 */
@Getter
@Setter
public class FixedTermAccount extends Account{
    private BigDecimal maxTranfer;

    /**
     * Constructor of FixedTermAccount.
     * @param id
     * @param numberAccount
     * @param freeComission
     * @param limitTransfer
     * @param clientId
     * @param balance
     * @param maxTransfer
     */
    public FixedTermAccount(Integer id, String numberAccount, Boolean freeComission, Boolean limitTransfer, Integer clientId, BigDecimal balance, BigDecimal maxTransfer){
        super(id, numberAccount, freeComission, limitTransfer, clientId, balance);
        this.maxTranfer = maxTransfer;
    }
}
