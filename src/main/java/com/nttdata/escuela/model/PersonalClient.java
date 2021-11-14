package com.nttdata.escuela.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Class PersonalClient is a child of Client Class.
 * Represent a person that is client of a bank.
 */
@Data
public class PersonalClient extends Client {
    private String dni;
    private String firstName;
    private String lastName;
    private Integer creditId;
    private Integer accountId;

    /**
     * Constructor with parameters.
     * @param id
     * @param dni
     * @param firstName
     * @param lastName
     * @param creditId
     * @param accountId
     */
    public PersonalClient(Integer id, String dni, String firstName, String lastName, Integer creditId, Integer accountId) {
        super();
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditId = creditId;
        this.accountId = accountId;
    }

    /**
     * Constructor empty.
     */
    public PersonalClient(){
        super();
    }
}
