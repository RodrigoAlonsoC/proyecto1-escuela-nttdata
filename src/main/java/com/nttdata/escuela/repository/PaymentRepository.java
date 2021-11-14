package com.nttdata.escuela.repository;

import com.nttdata.escuela.model.account.Movement;
import com.nttdata.escuela.model.account.TypeMovement;
import com.nttdata.escuela.model.credit.Payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PaymentRepository {
    private List<Payment> payments;
    public PaymentRepository(){
        this.payments =  new ArrayList<>();
    }
    public void setPayment(Payment payment){
        this.payments.add(payment);
    }
    public List<Payment> getAll(){
        payments.add(new Payment(1,10,5,new BigDecimal(100),new Date(2021,Calendar.NOVEMBER,25)));
        payments.add(new Payment(1,12,6,new BigDecimal(300),new Date(2021,Calendar.NOVEMBER,20)));
        return payments;
    }
}

