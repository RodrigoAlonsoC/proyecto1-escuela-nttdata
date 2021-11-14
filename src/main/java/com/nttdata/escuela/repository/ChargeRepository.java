package com.nttdata.escuela.repository;

import com.nttdata.escuela.model.credit.Charge;
import com.nttdata.escuela.model.credit.Payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ChargeRepository {
    private List<Charge> charge;
    public ChargeRepository(){
        this.charge =  new ArrayList<>();
    }
    public void setPayment(Charge charge){
        this.charge.add(charge);
    }
    public List<Charge> getAll(){
        charge.add(new Charge(1,new BigDecimal(10),5,new Date(2021,Calendar.NOVEMBER,26),10));
        charge.add(new Charge(2,new BigDecimal(30),6,new Date(2021,Calendar.NOVEMBER,26),12));
        return charge;
    }
}


/*

  private Integer id;
    private BigDecimal amount;
    private Integer creditId;
    private Date dateCharge;
       payments.add(new Payment(1,10,5,new BigDecimal(100),new Date(2021,Calendar.NOVEMBER,25)));
        payments.add(new Payment(1,12,6,new BigDecimal(300),new Date(2021,Calendar.NOVEMBER,20)));
        return payments;
 */