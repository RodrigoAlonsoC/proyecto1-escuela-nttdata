package com.nttdata.escuela.service;


import com.nttdata.escuela.model.account.Movement;
import com.nttdata.escuela.repository.ClientRepository;
import com.nttdata.escuela.repository.MovementRepository;


public class ClientService {

    private ClientRepository clientRepository;
    private MovementRepository movementRepository;
    public ClientService() {
       this.clientRepository = new ClientRepository();
       this.movementRepository = new MovementRepository();
    }


    /**
     * Return Clients
     */
    public void getClients(){
        this.clientRepository.getAll().forEach(System.out::println);
    }

    /**
     * Assign deposit
     * @param movement
     */
    public void makeDeposit(Movement movement)
    {
        movementRepository.setMovement(movement);
    }
}
