package com.nttdata.escuela.service;


import com.nttdata.escuela.model.account.Movement;
import com.nttdata.escuela.repository.AccountRepository;
import com.nttdata.escuela.repository.ClientRepository;
import com.nttdata.escuela.repository.MovementRepository;

import java.math.BigDecimal;


public class ClientService {

    private ClientRepository clientRepository;
    private MovementRepository movementRepository;
    private AccountRepository accountRepository;
    public ClientService() {
       this.clientRepository = new ClientRepository();
       this.movementRepository = new MovementRepository();
       this.accountRepository = new AccountRepository();
    }


    /**
     * Return Clients
     */
    public void getClients(){
        this.clientRepository.getAll().forEach(System.out::println);
    }

    /**
     * Assign deposit
     * @param movement
     */
    public void makeDeposit(Movement movement)
    {
        movementRepository.setMovement(movement);
        accountRepository.getAll()
                .stream()
                .filter(movementRow -> movementRow.getId().equals(movement.getAccountId()))
                .map(movementRow -> movementRow.getBalance().add(movement.getAmount())).forEach(System.out::println);
    }


}
