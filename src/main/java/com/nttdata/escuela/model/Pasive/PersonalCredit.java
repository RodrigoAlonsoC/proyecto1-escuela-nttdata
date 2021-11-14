package com.nttdata.escuela.model.Pasive;

import com.nttdata.escuela.model.PersonalClient;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class PersonalCredit extends Credit{
    private Integer personalClientId;

    public PersonalCredit(Integer id, BigDecimal balance, Integer personalClientId){
        super(id, balance);
        this.personalClientId = personalClientId;
    }
}
