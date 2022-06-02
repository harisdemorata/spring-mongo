package com.kotekaman.springmongo.users.endusers;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@Document
public class EndUser {

    @Id
    private  String id;
    private String firstName;
    private String lastName;
    private Address address;
    @Email
    @NotBlank
    private String email;

    private LocalDateTime createdAt;


    public EndUser(String firstName,String lastName, Address address, String email, LocalDateTime createdAt){
        this.address = address;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.createdAt = createdAt;
    }



}
