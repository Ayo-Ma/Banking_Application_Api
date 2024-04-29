package com.realtech.AptechBank.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String phoneNumber;
    private String address;
    private String stateOfOrigin;
}