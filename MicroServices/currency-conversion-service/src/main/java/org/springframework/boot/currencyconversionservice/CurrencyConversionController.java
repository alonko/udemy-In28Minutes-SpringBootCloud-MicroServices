package org.springframework.boot.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(
            @PathVariable String from, @PathVariable String to, BigDecimal quantity) {
//        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
//        if(currencyExchange == null) {
//            throw new RuntimeException("Unable to find data for " + from + " and " + to);
//        }
//        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
        return new CurrencyConversion(1000L, from, to, quantity, BigDecimal.TEN ,BigDecimal.ONE, "");
    }
}
