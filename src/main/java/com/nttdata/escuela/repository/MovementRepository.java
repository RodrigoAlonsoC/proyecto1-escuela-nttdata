package com.nttdata.escuela.repository;

import com.nttdata.escuela.model.account.Movement;
import com.nttdata.escuela.model.account.TypeMovement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Class MovementRepository is access to data of Movements.
 */
public class MovementRepository {
    private List<Movement> movements;

    /**
     * Constructor that represent connection between Model.
     */
    public MovementRepository(){
        this.movements =  new ArrayList<>();
    }

    /**
     * Method to Add a Movement to Data.
     * @param movement
     */
    public void setMovement(Movement movement){
        this.movements.add(movement);
    }

    /**
     * Method that retrieves all Movements.
     * @return List<Account>
     */
    public List<Movement> getAll(){

        movements.add(new Movement(1, new BigDecimal(50), TypeMovement.DEPOSIT, new Date(2021, Calendar.DECEMBER, 13), 1));
        movements.add(new Movement(12, new BigDecimal(25), TypeMovement.WITHDRAW, new Date(2021, Calendar.DECEMBER, 14), 1));

        movements.add(new Movement(2, new BigDecimal(20), TypeMovement.DEPOSIT, new Date(2021, Calendar.NOVEMBER, 30), 2));
        movements.add(new Movement(3, new BigDecimal(100), TypeMovement.DEPOSIT, new Date(2021, Calendar.OCTOBER, 21), 3));
        movements.add(new Movement(4, new BigDecimal(60), TypeMovement.DEPOSIT, new Date(2021, Calendar.MARCH, 6), 4));

        movements.add(new Movement(5, new BigDecimal(50), TypeMovement.DEPOSIT, new Date(2021, Calendar.JULY, 2), 5));
        movements.add(new Movement(6, new BigDecimal(50), TypeMovement.WITHDRAW, new Date(2021, Calendar.AUGUST, 4), 6));
        movements.add(new Movement(7, new BigDecimal(70), TypeMovement.WITHDRAW, new Date(2021, Calendar.APRIL, 28), 7));
        movements.add(new Movement(8, new BigDecimal(10), TypeMovement.WITHDRAW, new Date(2021, Calendar.OCTOBER, 22), 8));

        movements.add(new Movement(8, new BigDecimal(20), TypeMovement.WITHDRAW, new Date(2021, Calendar.OCTOBER, 26), 9));
        movements.add(new Movement(9, new BigDecimal(50), TypeMovement.WITHDRAW, new Date(2021, Calendar.JUNE, 15), 10));
        movements.add(new Movement(10, new BigDecimal(30), TypeMovement.WITHDRAW, new Date(2021, Calendar.AUGUST, 13), 11));
        movements.add(new Movement(11, new BigDecimal(50), TypeMovement.DEPOSIT, new Date(2021, Calendar.OCTOBER, 12), 12));


        return movements;
    }
}
