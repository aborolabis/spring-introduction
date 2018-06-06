package pl.aborolabis.springintroduction.model;

import java.math.BigDecimal;

public class PizzaOrder {

    private String description;
    private BigDecimal amount;

    public PizzaOrder(BigDecimal amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
