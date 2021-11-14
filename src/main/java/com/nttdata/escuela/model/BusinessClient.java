package com.nttdata.escuela.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Class BusinessClient is a child of Client Class.
 * Represent a real Business.
 */
@Data
public class BusinessClient extends Client{
    private String companyName;
    private String ruc;
    private List<Integer> businessCreditIds;
    private List<Integer> currentAccountIds;

    /**
     * Constructor with parameters.
     */
    public BusinessClient(Integer id, String ruc, String companyName, List<Integer> businessCreditIds, List<Integer> currentAccountIds) {
        super(id);
        this.ruc = ruc;
        this.companyName = companyName;
        this.businessCreditIds = businessCreditIds;
        this.currentAccountIds = currentAccountIds;
    }

    /**
     * Constructor Empty
     */
    public BusinessClient(){
        super();
    }


}
