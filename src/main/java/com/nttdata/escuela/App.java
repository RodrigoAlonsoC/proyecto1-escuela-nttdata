package com.nttdata.escuela;

import com.nttdata.escuela.model.account.Movement;
import com.nttdata.escuela.model.account.TypeMovement;
import com.nttdata.escuela.service.AccountService;
import com.nttdata.escuela.service.ClientService;
import com.nttdata.escuela.service.CreditService;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class App {
    public static Init bin;
    public static void main(String[] args) {
        bin = new Init();
        //System.out.println(bin.accountService.getByClient(1));
       // toPrint(bin.accountService.getByClient(1));
        //toPrint(accountService.getAll());
        Movement movement = new Movement(13,new BigDecimal(200), TypeMovement.DEPOSIT,new Date(2021, Calendar.NOVEMBER,15),1);
        bin.clientService.makeDeposit(movement);
        //System.out.println(bin.accountService.getByClient(1));
       // toPrint(bin.accountService.getByClient(1));
        //clientService.getClients();
        //CreditService creditService = new CreditService();
        //creditService.getCredits();

    }

    public static void toPrint(List<?> list){
        list.forEach(System.out::println);
    }

}
