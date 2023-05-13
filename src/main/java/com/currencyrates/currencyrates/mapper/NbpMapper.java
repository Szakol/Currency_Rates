package com.currencyrates.currencyrates.mapper;

import com.currencyrates.currencyrates.dto.CurrencyRateDTO;
import com.currencyrates.currencyrates.dto.ExchangeRatesTableDTO;
import com.currencyrates.currencyrates.entity.CurrencyRates;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NbpMapper {

    public static CurrencyRates convert(CurrencyRateDTO currencyRateDTO, Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(date);

        return CurrencyRates.builder()
                .bankSource("NBP")
                .currencyFrom("PLN")
                .currencyTo(currencyRateDTO.getCode())
                .rates(currencyRateDTO.getMid())
                .currencyDateFrom(formattedDate)
                .build();
    }

    public static List<CurrencyRates> convertList(ExchangeRatesTableDTO exchangeRatesTableDTO){
        List<CurrencyRates> listToReturn = new ArrayList<>();
        for(CurrencyRateDTO currencyRateDTO : exchangeRatesTableDTO.getRates()){
            listToReturn.add(convert(currencyRateDTO, exchangeRatesTableDTO.getEffectiveDate()));
        }
        return listToReturn;
    }
}
