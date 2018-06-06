package pl.aborolabis.springintroduction.model;

import java.math.BigDecimal;

public class PizzaOrder {

    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
