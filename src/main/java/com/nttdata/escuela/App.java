package com.nttdata.escuela;

import com.nttdata.escuela.service.AccountService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        //toPrint(accountService.getByClient(5));
        toPrint(accountService.getAll());
    }

    public static void toPrint(List<?> list){
        list.forEach(System.out::println);
    }
}
