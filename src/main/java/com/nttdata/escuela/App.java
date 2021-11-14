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

        /*
        bin = boot system
         */
        bin = new Init();

        /**
         * !there are more methods to use
         */

        /*
         request balance credit card by id client
         */
        bin.creditService.getCreditCardBalanceByClientId(10);

        /*
        request balance account by id client
         */
        toPrint(bin.accountService.getBalanceByClient(10));

        /*
        request movements by id client
         */
        toPrint(bin.accountService.getMovementsByClientId(1));



    }

    public static void toPrint(List<?> list){
        list.forEach(System.out::println);
    }

}
