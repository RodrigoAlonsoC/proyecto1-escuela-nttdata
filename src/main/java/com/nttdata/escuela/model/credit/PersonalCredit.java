package com.nttdata.escuela.model.credit;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Class PersonalCredit is a child of Credit.
 */
@Getter
@Setter
public class PersonalCredit extends Credit{
    private Integer personalClientId;

    /**
     * Constructor Empty.
     */
    public PersonalCredit(){
        super();
    }

    /**
     * Constructor with parameters.
     * @param id
     * @param balance
     * @param personalClientId
     */
    public PersonalCredit(Integer id, BigDecimal balance, Integer personalClientId){
        super(id, balance);
        this.personalClientId = personalClientId;
    }

}
