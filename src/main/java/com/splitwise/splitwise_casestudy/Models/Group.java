package com.splitwise.splitwise_casestudy.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "groups")
public class Group extends BaseModel {
    //Group : User
    //1 : M
    //M : 1
    //M : M

   @ManyToMany
   private List<User> admins;
    
   @ManyToMany
   private List<User> members;

   private String name;
}
