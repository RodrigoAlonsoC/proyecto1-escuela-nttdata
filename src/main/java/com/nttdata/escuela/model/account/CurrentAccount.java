package com.nttdata.escuela.model.account;

import java.math.BigDecimal;

public class CurrentAccount extends Account{
    public CurrentAccount(Integer id, String numberAccount, Boolean freeComission, Boolean limitTransfer, Integer clientId, BigDecimal balance){
        super(id, numberAccount, freeComission, limitTransfer, clientId, balance);
    }

}
