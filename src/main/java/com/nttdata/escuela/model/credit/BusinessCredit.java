package com.nttdata.escuela.model.credit;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Class BusinessCredit is a child of Credit.
 */
@Data
public class BusinessCredit extends Credit{

    private Integer businessClientId;

    /**
     * Constructor Empty.
     */
    public BusinessCredit(){
        super();
    }

    /**
     * Constructor with parameters.
     * @param id
     * @param balance
     * @param businessClientId
     */
    public BusinessCredit(Integer id, BigDecimal balance, Integer businessClientId){
        super(id, balance);
        this.businessClientId = businessClientId;
    }

}
