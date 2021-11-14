package com.nttdata.escuela.service;

import com.nttdata.escuela.repository.AccountRepository;
import com.nttdata.escuela.repository.ClientRepository;
import com.nttdata.escuela.repository.CreditRepository;
import com.nttdata.escuela.repository.MovementRepository;

import java.util.stream.Collectors;

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

    /**
     * Get credits of clients
     */
    public void getCredits(){
        creditRepository.getAllBusinessCredit().forEach(p -> System.out.println(p.getBusinessClientId()));
    }

    /**
     * Get balances by clientId
     * @param clientId
     */
    public void getCreditCardBalanceByClientId(Integer clientId){
        creditRepository.getAllCreditCard().stream()
                .filter(credit -> credit.getClientId().equals(clientId))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
