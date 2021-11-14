package com.nttdata.escuela.repository;

import com.nttdata.escuela.model.credit.Charge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Class ChargeRepository is access to data of Charges.
 */
public class ChargeRepository {

    private List<Charge> charge;

    /**
     * Constructor that represent connection between Model.
     */
    public ChargeRepository(){
        this.charge =  new ArrayList<>();
    }

    /**
     * Method to Add a Charge to Data.
     * @param charge
     */
    public void setCharge(Charge charge){
        this.charge.add(charge);
    }

    /**
     * Method that retrieves all Charges.
     * @return List<Charge>
     */
    public List<Charge> getAll(){
        charge.add(new Charge(1,new BigDecimal(10),5,new Date(2021,Calendar.NOVEMBER,26),10));
        charge.add(new Charge(2,new BigDecimal(30),6,new Date(2021,Calendar.NOVEMBER,26),12));

        return charge;
    }
}