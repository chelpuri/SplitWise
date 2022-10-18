package com.splitwise.splitwise_casestudy.Models;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Expense extends BaseModel{

    private int amount ;
    // Expense : User
    // M:1

    @ManyToOne
    private User createdBy;
    private String description;

    @ElementCollection
    private Map<User,Integer> paidBy;

    @ElementCollection
    private Map<User,Integer> owedBy;

}
