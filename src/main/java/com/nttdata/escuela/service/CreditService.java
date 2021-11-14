package com.nttdata.escuela.service;

import com.nttdata.escuela.App;
import com.nttdata.escuela.model.credit.Credit;
import com.nttdata.escuela.repository.ChargeRepository;
import com.nttdata.escuela.repository.CreditRepository;
import com.nttdata.escuela.repository.PaymentRepository;

import java.util.stream.Collectors;

/**
 * Class CreditService implement logic of Credit.
 */
public class CreditService extends App {

    /**
     * Get credits of clients
     */
    public void getCredits(){
        bin.creditRepository.getAllBusinessCredit()
                .forEach(System.out::println);
        bin.creditRepository.getAllPersonalCredit()
                .forEach(System.out::println);
        bin.creditRepository.getAllCreditCard()
                .forEach(System.out::println);
    }


    /**
     * Get balance of Credit Card by clientId
     * @param clientId
     */
    public void getCreditCardBalanceByClientId(Integer clientId){
        bin.creditRepository.getAllCreditCard().stream()
                .filter(credit -> credit.getClientId().equals(clientId))
                .map(Credit::getBalance)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    /**
     * Get balance of Business Credit by clientId
     * @param clientId
     */
    public void getBusinessCreditByClientId(Integer clientId){
        bin.creditRepository.getAllBusinessCredit().stream()
                .filter(credit -> credit.getBusinessClientId().equals(clientId))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    /**
     * Get balance of Personal Credit by clientId
     * @param clientId
     */
    public void getPersonalCreditByClientId(Integer clientId){
        bin.creditRepository.getAllPersonalCredit().stream()
                .filter(credit -> credit.getPersonalClientId().equals(clientId))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    /**
     * Get Payments and Charges of a Credit by CreditId
     * @param creditId
     */
    public void getPaymentAndChargeByCredit(Integer creditId){
        bin.paymentRepository.getAll()
                .stream()
                .filter(payment -> payment.getCreditId().equals(creditId))
                .forEach(System.out::println);
        bin.chargeRepository.getAll()
                .stream()
                .filter(charge -> charge.getCreditId().equals(creditId))
                .forEach(System.out::println);
    }

}
