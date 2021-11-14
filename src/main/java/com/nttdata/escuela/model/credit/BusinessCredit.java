package com.nttdata.escuela.model.credit;

import java.math.BigDecimal;

public class BusinessCredit extends Credit{

    private Integer businessClientId;

    public BusinessCredit(Integer id, BigDecimal balance, Integer businessClientId){
        super(id, balance);
        this.businessClientId = businessClientId;
    }
}
