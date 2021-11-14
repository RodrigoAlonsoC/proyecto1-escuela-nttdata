package com.nttdata.escuela.service;


import com.nttdata.escuela.App;
import com.nttdata.escuela.model.account.Account;
import com.nttdata.escuela.model.account.Movement;
import com.nttdata.escuela.repository.AccountRepository;
import com.nttdata.escuela.repository.ClientRepository;
import com.nttdata.escuela.repository.MovementRepository;

import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ClientService extends App  {



    /**
     * Return Clients
     */
    public void getClients(){
        bin.clientRepository.getAll().forEach(System.out::println);
    }

    /**
     * Assign deposit
     * @param movement
     */
    public void makeDeposit(Movement movement) {
        bin.movementRepository.setMovement(movement);
        bin.accountRepository.getAll().stream().filter(accountRow -> accountRow.getId().equals(movement.getAccountId())).findFirst().map(account -> this.addMount(account, movement)).get();
    }
    public static Account addMount(Account account,Movement movement){
        account.setBalance(account.getBalance().add(movement.getAmount()));
        return account;
    }

    public void makeWithdraw(Movement movement){
        bin.movementRepository.setMovement(movement);
        bin.accountRepository.getAll().stream().filter(accountRow -> accountRow.getId().equals(movement.getAccountId())).findFirst().map(account -> this.subtractMount(account, movement)).get();
    }
    public static Account subtractMount(Account account,Movement movement)
    {
        account.setBalance(account.getBalance().subtract(movement.getAmount()));
        return account;
    }

}
