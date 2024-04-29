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
public class TransferRequest {
    private String senderAccountNumber;
    private String recipientAccountNumber;
    private BigDecimal accountToSend;
}
