package com.nttdata.escuela.model.Active;

import com.nttdata.escuela.model.Client;

import java.math.BigDecimal;
import java.util.List;

public class CurrentAccount extends Account{
    public CurrentAccount(Integer id, String numberAccount, Boolean freeComission, Boolean limitTransfer, Integer clientId, BigDecimal balance){
        super(id, numberAccount, freeComission, limitTransfer, clientId, balance);
    }

}
