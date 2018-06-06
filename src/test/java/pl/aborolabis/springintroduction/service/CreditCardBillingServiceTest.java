package pl.aborolabis.springintroduction.service;

import org.junit.Assert;
import org.junit.Test;
import pl.aborolabis.springintroduction.model.CreditCard;
import pl.aborolabis.springintroduction.model.PizzaOrder;
import pl.aborolabis.springintroduction.model.Receipt;

import java.math.BigDecimal;

public class CreditCardBillingServiceTest {

    @Test
    public void shouldCreateReceiptForProperOrder() {
        CreditCardProcessorFactory.setInstance(new TestCreditCardProcessor());
        TransactionLogFactory.setInstance(new TestTransactionLog());

        CreditCardBillingService creditCardBillingService = new CreditCardBillingService();

        PizzaOrder pizzaOrder = new PizzaOrder(BigDecimal.TEN, "Pizzaaa");
        CreditCard creditCard = new CreditCard();

        Receipt actualReceipt = creditCardBillingService.chargeOrder(pizzaOrder, creditCard);

        Assert.assertTrue(actualReceipt.isSuccessful());
        Assert.assertTrue(actualReceipt.getAmount().equals(BigDecimal.TEN));
    }

}
