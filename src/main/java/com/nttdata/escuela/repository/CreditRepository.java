package com.nttdata.escuela.repository;

import com.nttdata.escuela.model.credit.BusinessCredit;
import com.nttdata.escuela.model.credit.CreditCard;
import com.nttdata.escuela.model.credit.PersonalCredit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CreditRepository {

    public List<BusinessCredit> getAllBusinessCredit() {
        List<BusinessCredit> businessCredits = new ArrayList<>();
        businessCredits.add(new BusinessCredit(7, new BigDecimal(5000), 3));
        businessCredits.add(new BusinessCredit(8, new BigDecimal(8000), 8));

        return businessCredits;
    }

    public List<PersonalCredit> getAllPersonalCredit() {
        List<PersonalCredit> personalCredits = new ArrayList<>();
        personalCredits.add(new PersonalCredit(1, new BigDecimal(5000), 1));
        personalCredits.add(new PersonalCredit(2, new BigDecimal(2000), 2));
        personalCredits.add(new PersonalCredit(3, new BigDecimal(5000), 6));
        personalCredits.add(new PersonalCredit(4, new BigDecimal(2000), 8));

        return personalCredits;
    }

    public List<CreditCard> getAllCreditCard() {
        List<CreditCard> credits = new ArrayList<>();
        credits.add(new CreditCard(5, new BigDecimal(3000), 10, new BigDecimal(5000)));
        credits.add(new CreditCard(6, new BigDecimal(1000), 12, new BigDecimal(4000)));

        return credits;
    }

}
