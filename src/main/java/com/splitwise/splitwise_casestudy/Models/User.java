package com.splitwise.splitwise_casestudy.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseModel {

    private String name;
    private String phoneNumber;
    private String hashedPassword;

}
