package com.nttdata.escuela.model.credit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Class Credit represent Pasives.
 */
@Data
@AllArgsConstructor
public abstract class Credit {
    private Integer id;
    private BigDecimal balance;

    public Credit(){
    }

}
