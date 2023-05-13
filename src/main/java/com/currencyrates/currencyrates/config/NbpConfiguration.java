package com.currencyrates.currencyrates.config;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("bank.nbp")
@Getter
@Setter
public class NbpConfiguration {

    @NotNull
    private String url;
}
