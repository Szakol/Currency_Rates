package com.currencyrates.currencyrates.repository;

import com.currencyrates.currencyrates.entity.CurrencyRates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRatesRepository extends JpaRepository<CurrencyRates, Long> {
}
