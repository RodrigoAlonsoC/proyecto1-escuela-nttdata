package com.nttdata.escuela.model.credit;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
public class Payment {
    private Integer id;
    private Integer clientId;
    private Integer creditId;
    private BigDecimal amount;
    private Date datePayment;

}
