package com.currencyrates.currencyrates.dto;

import lombok.Data;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Data
@XmlRootElement(name = "Rate")
@XmlAccessorType(XmlAccessType.FIELD)
public class CurrencyRateDTO {

    @XmlElement(name = "Currency")
    private String currency;

    @XmlElement(name = "Code")
    private String code;

    @XmlElement(name = "Mid")
    private BigDecimal mid;
}