package com.nttdata.escuela.model.credit;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
public class CreditCard extends Credit{
    private Integer clientId;
    private BigDecimal creditCardLimit;
    public CreditCard(){
        super();
    }
    public CreditCard(Integer id, BigDecimal balance, Integer clientId, BigDecimal creditCardLimit){
        super(id, balance);
        this.clientId = clientId;
        this.creditCardLimit = creditCardLimit;
    }

}
