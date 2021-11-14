package com.nttdata.escuela.repository;

import com.nttdata.escuela.model.account.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Class AccountRepository is access to data of Accounts.
 */
public class AccountRepository {
<<<<<<< Updated upstream
    public List<Account> accounts;
=======
    private List<Account> accounts;

    /**
     * Constructor that represent connection between Model.
     */
>>>>>>> Stashed changes
    public AccountRepository(){
        this.accounts =  new ArrayList<>();
    }

    /**
     * Method to Add a Account to Data.
     * @param account
     */
    public void setAccount(Account account){
        this.accounts.add(account);
    }

    /**
     * Method that retrieves all Accounts.
     * @return List<Account>
     */
    public List<Account> getAll(){
        accounts.add(new CurrentAccount(1, "111-45678-9",false, true, 1, new BigDecimal(102.1)));
        accounts.add(new CurrentAccount(2, "111-31238-6", false, true, 2, new BigDecimal(200.11)));
        accounts.add(new CurrentAccount(3, "111-54348-7",false, true, 3, new BigDecimal(500)));
        accounts.add(new CurrentAccount(4, "111-98795-8", false, true, 4, new BigDecimal(1500.50)));

        accounts.add(new SavingsAccount(5, "122-45678-9",true, false, 5, new BigDecimal(102.1), new BigDecimal(2000)));
        accounts.add(new SavingsAccount(6, "122-31238-6", true, false, 6, new BigDecimal(200.11), new BigDecimal(1000)));
        accounts.add(new SavingsAccount(7, "122-54348-7",true, false, 7, new BigDecimal(500), new BigDecimal(3000)));
        accounts.add(new SavingsAccount(8, "122-98795-8", true, false, 8, new BigDecimal(1500.50), new BigDecimal(1000)));

        accounts.add(new FixedTermAccount(9, "133-45678-9",true, true, 9, new BigDecimal(102.1), new BigDecimal(2000)));
        accounts.add(new FixedTermAccount(10, "133-31238-6", true, true, 10, new BigDecimal(200.11), new BigDecimal(1000)));
        accounts.add(new FixedTermAccount(11, "133-54348-7",true, true, 11, new BigDecimal(500), new BigDecimal(3000)));
        accounts.add(new FixedTermAccount(12, "133-98795-8", true, true, 12, new BigDecimal(1500.50), new BigDecimal(1000)));

        return accounts;
    }
    public void updateAccountRepository(List<Account> listAccount){
        this.accounts = listAccount;
    }
}
