package com.nttdata.escuela.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class Client represent a real Client.
 */
@Data
@AllArgsConstructor
public abstract class Client {
    private Integer id;

    /**
     * Constructor Empty
     */
    public Client(){

    }
}
