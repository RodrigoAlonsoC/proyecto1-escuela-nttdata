package com.nttdata.escuela;

import com.nttdata.escuela.service.AccountService;
import com.nttdata.escuela.service.ClientService;
import com.nttdata.escuela.service.CreditService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //AccountService accountService = new AccountService();
        //toPrint(accountService.getByClient(5));
        //toPrint(accountService.getAll());
        ClientService clientService = new ClientService();
        //clientService.getClients();
        CreditService creditService = new CreditService();
        creditService.getCredits();
    }

    public static void toPrint(List<?> list){
        list.forEach(System.out::println);
    }
}
/*
  Integer ope;
        ClientService clientService = new ClientService();
        do {
            Scanner read = new Scanner(System.in);
            System.out.println("[1] Client");
            System.out.println("[2] System");
            System.out.println("[0] Exit");
            ope = read.nextInt();
            switch (ope) {
                case 1:
                    System.out.println("[1] Agregar nuevo usuario");
                    System.out.println("[2] Listar usuarios y editar usuario");
                    System.out.println("[3] Listar usuarios");
                    Integer op = read.nextInt();
                    switch (op){
                        case 1:
                            System.out.println("Ingrese un unico ID");
                            Integer id = read.nextInt();
                            PersonalClient personalClient = new PersonalClient(id);
                            System.out.println("Ingresa el DNI del cliente:");
                            String dni = read.nextLine().trim();
                            System.out.println("Ingresa su primer nombre:");
                            String firstName = read.nextLine().trim();
                            System.out.println("Ingresa su segundo nombre");
                            String lastName = read.nextLine().trim();
                            personalClient.setDni(dni);
                            personalClient.setFirstName(firstName);
                            personalClient.setLastName(lastName);
                            clientService.setClient(personalClient);
                            break;
                        case 2:
                            break;
                        case 3:
                            clientService.getClients();
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Fail operation");
                    break;
            }
        }while(!ope.equals(0));

 */
