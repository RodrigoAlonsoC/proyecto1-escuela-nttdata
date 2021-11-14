package com.nttdata.escuela.model.Active;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class Movement {
    private Integer id;
    private BigDecimal amount;
    private TypeMovement typeMovement;
    private Date date;
    private Integer accountId;
}
