package pl.aborolabis.springintroduction.service;

import pl.aborolabis.springintroduction.model.CreditCard;

import java.math.BigDecimal;

public interface CreditCardProcessor {

    ChargeResult charge(CreditCard creditCard, BigDecimal amound);
}
