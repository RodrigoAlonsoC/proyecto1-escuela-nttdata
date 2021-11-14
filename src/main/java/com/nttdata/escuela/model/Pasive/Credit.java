package com.nttdata.escuela.model.Pasive;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public abstract class Credit {
    private Integer id;
    private BigDecimal balance;
}
