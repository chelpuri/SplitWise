package com.splitwise.splitwise_casestudy.Models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class GroupExpense extends BaseModel{
    //GroupExpense : Group
    // 1:1
    //M:1

    @ManyToOne
    private Group group;

    //GroupExpense : Expense
    // 1:1
    //1:1

    @OneToOne
    private Expense expense;
}
