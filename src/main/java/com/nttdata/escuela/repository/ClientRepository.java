package com.nttdata.escuela.repository;

import com.nttdata.escuela.model.BusinessClient;
import com.nttdata.escuela.model.Client;
import com.nttdata.escuela.model.PersonalClient;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
    public List<Client> getAll(){
        List<Client> clients = new ArrayList<>();
        clients.add(new PersonalClient(1 ,"72541100", "Jose", "Panta",1,1));
        clients.add(new PersonalClient(2 ,"60541101", "Francisco", "Zapata",2,2));

        clients.add(new BusinessClient(3, "79979797977", "Coca-Cola",  List.of(7, 8), null));
        clients.add(new BusinessClient(4, "14124123123", "Backus", null, List.of(3, 4)));

        clients.add(new PersonalClient(5 ,"12312312", "Luis", "Vega",null,5));
        clients.add(new PersonalClient(6 ,"54364563", "Juan", "Medina",3,6));
        clients.add(new PersonalClient(7 ,"87784232", "Pedro", "Vargas",null,7));
        clients.add(new PersonalClient(8 ,"38120381", "Maria", "Vargas", 4,8));

        clients.add(new PersonalClient(9 ,"12312312", "Luis", "Vega",null,5));
        clients.add(new PersonalClient(10 ,"54364563", "Juan", "Medina",5,6));
        clients.add(new PersonalClient(11 ,"87784232", "Pedro", "Vargas",null,7));
        clients.add(new PersonalClient(12,"38120381", "Maria", "Vargas", 6,8));


        return clients;
    }

}
