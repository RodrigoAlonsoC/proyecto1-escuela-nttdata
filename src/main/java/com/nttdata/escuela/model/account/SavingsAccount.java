package com.nttdata.escuela.model.account;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Class SavingsAccount is a child of Account.
 * Has a LimitTransfer: false
 * Has a FreeComission: true
 * Required a maximum quantity represent with MaxTranfer.
 */
@Getter
@Setter
public class SavingsAccount extends Account{
    private BigDecimal maxTransfer;

    /**
     * Constructor of SavingsAccount.
     * @param id
     * @param numberAccount
     * @param freeComission
     * @param limitTransfer
     * @param clientId
     * @param balance
     * @param maxTransfer
     */
    public SavingsAccount(Integer id, String numberAccount, Boolean freeComission, Boolean limitTransfer, Integer clientId, BigDecimal balance, BigDecimal maxTransfer){
        super(id, numberAccount, freeComission, limitTransfer, clientId, balance);
        this.maxTransfer = maxTransfer;
    }
}
