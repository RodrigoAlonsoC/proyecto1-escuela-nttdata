package com.nttdata.escuela.service;

import com.nttdata.escuela.model.account.Account;
import com.nttdata.escuela.model.account.Movement;
import com.nttdata.escuela.repository.AccountRepository;
import com.nttdata.escuela.repository.MovementRepository;

import java.util.List;
import java.util.stream.Collectors;

public class AccountService {

    private final AccountRepository accountRepository;
    private final MovementRepository movementRepository;

    public AccountService(){
        accountRepository = new AccountRepository();
        movementRepository = new MovementRepository();
    }

    public List<Account> getAll(){
        return accountRepository.getAll();
    }

    public List<Account> getByClient(Integer clientId){
        return accountRepository.getAll()
                .stream()
                .filter(account -> account.getClientId().equals(clientId))
                .collect(Collectors.toList());
    }

    public List<Account> getByNumberAccount(String numberAccount){
        return accountRepository.getAll()
                .stream()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .collect(Collectors.toList());
    }

    public List<String> getBalanceByClient(Integer clientId){
        return accountRepository.getAll()
                .stream()
                .filter(account -> account.getClientId().equals(clientId))
                .map(account -> String.join(" ", account.getNumberAccount(), account.getBalance().toString()))
                .collect(Collectors.toList());
    }

    public List<String> getBalanceByNumberAccount(String numberAccount){
        return accountRepository.getAll()
                .stream()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .map(account -> String.join(" ", account.getNumberAccount(), account.getBalance().toString()))
                .collect(Collectors.toList());
    }

    public List<String> getBalanceByClientAndNumberAccount(Integer clientId, String numberAccount){
        return accountRepository.getAll()
                .stream()
                .filter(account -> account.getClientId().equals(clientId))
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .map(account -> String.join(" ", account.getNumberAccount(), account.getBalance().toString()))
                .collect(Collectors.toList());
    }

    public List<Movement> getMovementsByClientId(Integer clientId){
        return movementRepository.getAll()
                .stream()
                .filter(movement -> movement.getAccountId().equals(clientId))
                .collect(Collectors.toList());
    }

    public List<Movement> getMovementsByNumberAccount(String numberAccount){
        Integer clientId = accountRepository.getAll()
                .stream()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .findFirst().get().getClientId();

        return movementRepository.getAll()
                .stream()
                .filter(movement -> movement.getAccountId().equals(clientId))
                .collect(Collectors.toList());
    }

}
