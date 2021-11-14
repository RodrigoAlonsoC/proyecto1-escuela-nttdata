package com.nttdata.escuela.model.credit;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BusinessCredit extends Credit{

    private Integer businessClientId;
    public BusinessCredit(){
        super();
    }
    public BusinessCredit(Integer id, BigDecimal balance, Integer businessClientId){
        super(id, balance);
        this.businessClientId = businessClientId;
    }

}
