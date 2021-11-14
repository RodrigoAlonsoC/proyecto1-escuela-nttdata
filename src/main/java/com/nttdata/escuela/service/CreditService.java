package com.nttdata.escuela.service;

import com.nttdata.escuela.repository.AccountRepository;
import com.nttdata.escuela.repository.ClientRepository;
import com.nttdata.escuela.repository.CreditRepository;
import com.nttdata.escuela.repository.MovementRepository;

public class CreditService {
    private AccountRepository accountRepository;
    private CreditRepository creditRepository;
    private ClientRepository clientRepository;
    private MovementRepository movementRepository;

    public CreditService() {
        accountRepository = new AccountRepository();
        creditRepository = new CreditRepository();
        clientRepository = new ClientRepository();
        movementRepository = new MovementRepository();
    }
    public void getCredits(){
        creditRepository.getAllBusinessCredit().forEach(p -> System.out.println(p.getBusinessClientId()));
    }
}
