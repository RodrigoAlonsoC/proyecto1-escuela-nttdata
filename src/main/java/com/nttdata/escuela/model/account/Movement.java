package com.nttdata.escuela.model.account;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Class Movement represent any type of action with account.
 * This use a Enum call TypeMovement.
 */
@Data
@AllArgsConstructor
public class Movement {
    private Integer id;
    private BigDecimal amount;
    private TypeMovement typeMovement;
    private Date date;
    private Integer accountId;
}
