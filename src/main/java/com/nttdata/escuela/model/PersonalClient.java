package com.nttdata.escuela.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalClient extends Client {
    private String dni;
    private String firstName;
    private String lastName;
    private Integer creditId;
    private Integer accountId;

    public PersonalClient(Integer id, String dni, String firstName, String lastName, Integer creditId, Integer accountId) {
        super(id);
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditId = creditId;
        this.accountId = accountId;
    }
}
