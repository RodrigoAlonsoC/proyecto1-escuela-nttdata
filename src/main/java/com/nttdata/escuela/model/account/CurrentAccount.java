package com.nttdata.escuela.model.account;

import java.math.BigDecimal;

/**
 * Class CurrentAccount is a child of Account.
 * Has a LimitTransfer: true
 * Has a FreeComission: false
 */
public class CurrentAccount extends Account{

    /**
     * Constructor of CurrentAccount Class.
     * @param id
     * @param numberAccount
     * @param freeComission
     * @param limitTransfer
     * @param clientId
     * @param balance
     */
    public CurrentAccount(Integer id, String numberAccount, Boolean freeComission, Boolean limitTransfer, Integer clientId, BigDecimal balance){
        super(id, numberAccount, freeComission, limitTransfer, clientId, balance);
    }

}
