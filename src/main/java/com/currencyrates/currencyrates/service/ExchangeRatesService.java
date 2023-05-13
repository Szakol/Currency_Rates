package com.currencyrates.currencyrates.service;

import com.currencyrates.currencyrates.config.NbpConfiguration;
import com.currencyrates.currencyrates.dto.ExchangeRatesTableDTO;
import com.currencyrates.currencyrates.entity.CurrencyRates;
import com.currencyrates.currencyrates.mapper.NbpMapper;
import com.currencyrates.currencyrates.repository.CurrencyRatesRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExchangeRatesService {

    private final CurrencyRatesRepository currencyRatesRepository;
    private final NbpConfiguration nbpConfiguration;
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public void getNewExchangeRatesFromBank() throws IOException {
        String response = restTemplate.getForObject(nbpConfiguration.getUrl(), String.class);
        ExchangeRatesTableDTO[] exchangeRatesTableDTOs = objectMapper.readValue(response, ExchangeRatesTableDTO[].class);
        List<CurrencyRates> currencyRatesList = NbpMapper.convertList(exchangeRatesTableDTOs[0]);

        currencyRatesRepository.saveAll(currencyRatesList);
    }
}