package com.nttdata.escuela.model.credit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class Charge {
    private Integer id;
    private BigDecimal amount;
    private Integer creditId;
    private Date dateCharge;
    private Integer clientId;
}
