package pl.aborolabis.springintroduction;

import pl.aborolabis.springintroduction.model.CreditCard;
import pl.aborolabis.springintroduction.model.PizzaOrder;
import pl.aborolabis.springintroduction.model.Receipt;
import pl.aborolabis.springintroduction.service.*;

public class Application {

    public static void main(String[] args) {

        CreditCardProcessorFactory.setInstance(new PaypalCreditCardProcessor());
        TransactionLogFactory.setInstance(new DatabaseTransactionLog());

        BillingService billingService = new CreditCardBillingService();

        PizzaOrder pizzaOrder = new PizzaOrder();
        CreditCard creditCard = new CreditCard();

        Receipt receipt = billingService.chargeOrder(pizzaOrder, creditCard);

        System.out.println(receipt);
    }

}
