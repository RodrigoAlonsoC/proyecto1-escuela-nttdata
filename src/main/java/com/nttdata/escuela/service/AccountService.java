package com.nttdata.escuela.service;

import com.nttdata.escuela.App;
import com.nttdata.escuela.model.account.Account;
import com.nttdata.escuela.model.account.Movement;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class AccountService implement logic of Account.
 */
public class AccountService extends App {

    /**
     * Constructor of Class AccountService
     */
    public AccountService(){

    }

    /**
     * Get all data of accounts
     * @return List<Account>
     */
    public List<Account> getAll(){
        return bin.accountRepository.getAll();
    }

    /**
     * Get account by clientId
     * @param clientId
     * @return List<Account>
     */
    public List<Account> getByClient(Integer clientId){
        return bin.accountRepository.getAll()
                .stream()
                .filter(account -> account.getClientId().equals(clientId)).findFirst().stream().collect(Collectors.toList());
    }

    /**
     * Get Account by numberAccount
     * @param numberAccount
     * @return List<Account>
     */
    public List<Account> getByNumberAccount(String numberAccount){
        return bin.accountRepository.getAll()
                .stream()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .collect(Collectors.toList());
    }

    /**
     * Get balance by CliendId
     * @param clientId
     * @return List<String>
     */
    public List<String> getBalanceByClient(Integer clientId){
        return bin.accountRepository.getAll()
                .stream()
                .filter(account -> account.getClientId().equals(clientId))
                .map(account -> String.join(" ", account.getNumberAccount(), account.getBalance().toString()))
                .collect(Collectors.toList());
    }

    /**
     * Get balance by numberAccount
     * @param numberAccount
     * @return List<String>
     */
    public List<String> getBalanceByNumberAccount(String numberAccount){
        return bin.accountRepository.getAll()
                .stream()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .map(account -> String.join(" ", account.getNumberAccount(), account.getBalance().toString()))
                .collect(Collectors.toList());
    }


    /**
     * Get balance by cliendId and numberAccount
     * @param clientId
     * @param numberAccount
     * @return List<String>
     */
    public List<String> getBalanceByClientAndNumberAccount(Integer clientId, String numberAccount){
        return bin.accountRepository.getAll()
                .stream()
                .filter(account -> account.getClientId().equals(clientId))
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .map(account -> String.join(" ", account.getNumberAccount(), account.getBalance().toString()))
                .collect(Collectors.toList());
    }

    /**
     * Get movements by CliendId
     * @param clientId
     * @return List<Movement>
     */
    public List<Movement> getMovementsByClientId(Integer clientId){
        return bin.movementRepository.getAll()
                .stream()
                .filter(movement -> movement.getAccountId().equals(clientId))
                .collect(Collectors.toList());
    }

    /**
     * Get movements by numberAcoount
     * @param numberAccount
     * @return List<Movement>
     */
    public List<Movement> getMovementsByNumberAccount(String numberAccount){
        Integer clientId = bin.accountRepository.getAll()
                .stream()
                .filter(account -> account.getNumberAccount().equals(numberAccount))
                .findFirst().get().getClientId();

        return bin.movementRepository.getAll()
                .stream()
                .filter(movement -> movement.getAccountId().equals(clientId))
                .collect(Collectors.toList());
    }

}
