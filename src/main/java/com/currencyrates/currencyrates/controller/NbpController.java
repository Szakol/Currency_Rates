package com.currencyrates.currencyrates.controller;

import com.currencyrates.currencyrates.service.ExchangeRatesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/nbp")
@RequiredArgsConstructor
public class NbpController {

    private final ExchangeRatesService exchangeRatesService;

    @GetMapping()
    public ResponseEntity<Void> getNewExchangeRatesFromBank() throws IOException {
        exchangeRatesService.getNewExchangeRatesFromBank();
        return ResponseEntity.ok().build();
    }
}
