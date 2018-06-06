package pl.aborolabis.springintroduction.service;

import org.junit.Test;
import pl.aborolabis.springintroduction.model.CreditCard;
import pl.aborolabis.springintroduction.model.PizzaOrder;
import pl.aborolabis.springintroduction.model.Receipt;

public class CreditCardBillingServiceTest {

    @Test
    void shouldCreateReceiptForProperOrder() {
        CreditCardBillingService creditCardBillingService = new CreditCardBillingService();

        PizzaOrder pizzaOrder = new PizzaOrder();
        CreditCard creditCard = new CreditCard();

        Receipt actualReceipt = creditCardBillingService.chargeOrder(pizzaOrder, creditCard);

        // TODO: porównać actualReceipt z poprawnym rachunkiem.
    }

}
