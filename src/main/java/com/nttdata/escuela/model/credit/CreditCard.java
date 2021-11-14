package com.nttdata.escuela.model.credit;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Class CreditCard is a child of Credit.
 */
@Data
public class CreditCard extends Credit{
    private Integer clientId;
    private BigDecimal creditCardLimit;

    /**
     * Constructor Empty
     */
    public CreditCard(){
        super();
    }

    /**
     * Constructor with parameters
     * @param id
     * @param balance
     * @param clientId
     * @param creditCardLimit
     */
    public CreditCard(Integer id, BigDecimal balance, Integer clientId, BigDecimal creditCardLimit){
        super(id, balance);
        this.clientId = clientId;
        this.creditCardLimit = creditCardLimit;
    }

}
