package com.nttdata.escuela.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class BusinessClient extends Client{
    private String companyName;
    private String ruc;
    private List<Integer> businessCreditIds;
    private List<Integer> currentAccountIds;

    public BusinessClient(Integer id, String ruc, String companyName, List<Integer> businessCreditIds, List<Integer> currentAccountIds) {
        super(id);
        this.ruc = ruc;
        this.companyName = companyName;
        this.businessCreditIds = businessCreditIds;
        this.currentAccountIds = currentAccountIds;
    }
    public BusinessClient(){
        super();
    }


}
