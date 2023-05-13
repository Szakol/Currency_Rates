package com.currencyrates.currencyrates.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyRates {

    @Id
    @GeneratedValue
    private Long id;

    private String bankSource;

    private String currencyFrom;

    private String currencyTo;

    private BigDecimal rates;

    private String currencyDateFrom;
}
