package com.nttdata.escuela.model.credit;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PersonalCredit extends Credit{
    private Integer personalClientId;

    public PersonalCredit(Integer id, BigDecimal balance, Integer personalClientId){
        super(id, balance);
        this.personalClientId = personalClientId;
    }
}
