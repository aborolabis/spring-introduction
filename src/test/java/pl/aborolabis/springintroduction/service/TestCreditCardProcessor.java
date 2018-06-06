package pl.aborolabis.springintroduction.service;

import pl.aborolabis.springintroduction.model.CreditCard;

import java.math.BigDecimal;

public class TestCreditCardProcessor implements CreditCardProcessor {

    public ChargeResult charge(CreditCard creditCard, BigDecimal amound) {
        return null;
    }
}
