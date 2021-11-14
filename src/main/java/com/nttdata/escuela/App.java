package com.nttdata.escuela;

import com.nttdata.escuela.service.AccountService;
import com.nttdata.escuela.service.ClientService;
import com.nttdata.escuela.service.CreditService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //AccountService accountService = new AccountService();
        //toPrint(accountService.getByClient(5));
        //toPrint(accountService.getAll());
        ClientService clientService = new ClientService();
        //clientService.getClients();
        CreditService creditService = new CreditService();
        creditService.getCredits();
    }

    public static void toPrint(List<?> list){
        list.forEach(System.out::println);
    }
}
