package com.realtech.AptechBank.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailDetails {
    private String receipient;
    private String messageBody;
    private String subject;
}
