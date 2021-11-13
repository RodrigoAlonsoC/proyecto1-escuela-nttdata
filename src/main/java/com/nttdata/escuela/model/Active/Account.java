package com.nttdata.escuela.model.Active;

import com.nttdata.escuela.model.Client;

import java.util.List;

public abstract class Account {
    private Boolean freeComission;
    private Boolean limitTransfer;
    private List<Client> clients;
    private double balance;
}
