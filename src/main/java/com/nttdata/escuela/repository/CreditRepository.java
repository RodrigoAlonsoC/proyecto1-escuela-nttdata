package com.nttdata.escuela.repository;

import com.nttdata.escuela.model.Client;
import com.nttdata.escuela.model.Pasive.BusinessCredit;
import com.nttdata.escuela.model.Pasive.Credit;
import com.nttdata.escuela.model.Pasive.CreditCard;
import com.nttdata.escuela.model.Pasive.PersonalCredit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CreditRepository {
    public List<Credit> getAll(){
        List<Credit> credits = new ArrayList<>();
        credits.add(new PersonalCredit(1, new BigDecimal(5000), 1));
        credits.add(new PersonalCredit(2, new BigDecimal(2000), 2));
        credits.add(new PersonalCredit(3, new BigDecimal(5000), 6));
        credits.add(new PersonalCredit(4, new BigDecimal(2000), 8));

        credits.add(new CreditCard(5, new BigDecimal(2000), 10, new BigDecimal(5000)));
        credits.add(new CreditCard(6, new BigDecimal(1000), 12, new BigDecimal(4000)));

        credits.add(new BusinessCredit(7, new BigDecimal(5000), 3));
        credits.add(new BusinessCredit(8, new BigDecimal(8000), 3));

        return credits ;
    }
}
