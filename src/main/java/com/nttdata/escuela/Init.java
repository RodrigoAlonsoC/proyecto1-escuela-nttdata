package com.nttdata.escuela;

import com.nttdata.escuela.repository.*;
import com.nttdata.escuela.service.AccountService;
import com.nttdata.escuela.service.ClientService;
import com.nttdata.escuela.service.CreditService;
import lombok.Data;


public class Init {
    public static AccountService accountService;
    public static ClientService clientService;
    public static CreditService creditService;

    public static AccountRepository accountRepository;
    public static ChargeRepository chargeRepository;
    public static ClientRepository clientRepository;
    public static CreditRepository creditRepository;
    public static MovementRepository movementRepository;
    public static PaymentRepository paymentRepository;

    public Init() {
        initService();
        initRepository();
    }

    public void initService() {
        this.accountService = new AccountService();
        this.clientService = new ClientService();
        this.creditService = new CreditService();
    }

    public void initRepository() {
        this.accountRepository = new AccountRepository();
        this.chargeRepository = new ChargeRepository();
        this.clientRepository = new ClientRepository();
        this.creditRepository = new CreditRepository();
        this.movementRepository = new MovementRepository();
        this.paymentRepository = new PaymentRepository();
    }

}
