package com.currencyrates.currencyrates.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@Data
@XmlRootElement(name = "ExchangeRatesTable")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExchangeRatesTableDTO {

    @XmlElement(name = "Table")
    private String table;

    @XmlElement(name = "No")
    private String no;

    @XmlElement(name = "EffectiveDate")
    private Date effectiveDate;

    @XmlElement(name = "Rates")
    private List<CurrencyRateDTO> rates;
}