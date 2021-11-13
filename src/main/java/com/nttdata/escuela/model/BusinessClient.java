package com.nttdata.escuela.model;

import com.nttdata.escuela.model.Active.CurrentAccount;
import com.nttdata.escuela.model.Pasive.BusinessCredit;

import java.util.List;

public class BusinessClient extends Client{
    private List<BusinessCredit> businessCredits;
    private List<CurrentAccount> currentAccounts;
}
