package com.nttdata.escuela.model.Pasive;

import com.nttdata.escuela.model.Client;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CreditCard extends Credit{
    private Integer clientId;

    public CreditCard(Integer id, BigDecimal balance, Integer clientId){
        super(id, balance);
        this.clientId = clientId;
    }
}
