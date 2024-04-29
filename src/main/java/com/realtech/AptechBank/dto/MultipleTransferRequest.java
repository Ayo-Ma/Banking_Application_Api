package com.realtech.AptechBank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MultipleTransferRequest {
    private String senderAccountNumber;
    private String firstRecipientAccountNumber;
    private String secondRecipientAccountNumber;
    private BigDecimal firstRecipientAmountToSend;
    private BigDecimal secondRecipientAmountToSend;
}
