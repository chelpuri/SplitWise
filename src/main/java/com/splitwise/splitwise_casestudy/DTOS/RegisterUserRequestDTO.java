package com.splitwise.splitwise_casestudy.DTOS;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegisterUserRequestDTO {
    private String name;
    private String phoneNumber;
    private String hashedPassword;
}
