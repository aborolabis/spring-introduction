package pl.aborolabis.springintroduction.service;

import pl.aborolabis.springintroduction.exception.UnreachableException;
import pl.aborolabis.springintroduction.model.CreditCard;
import pl.aborolabis.springintroduction.model.PizzaOrder;
import pl.aborolabis.springintroduction.model.Receipt;

public class CreditCardBillingService implements BillingService {

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        CreditCardProcessor processor = new PaypalCreditCardProcessor();
        TransactionLog transactionLog = new DatabaseTransactionLog();

        try {
            ChargeResult result = processor.charge(creditCard, order.getAmount());
            transactionLog.logChargeResult(result);

            return result.wasSuccessful()
                    ? Receipt.forSuccessfulCharge(order.getAmount())
                    : Receipt.forDeclinedCharge(result.getDeclineMessage());
        } catch (UnreachableException e) {
            transactionLog.logConnectException(e);
            return Receipt.forSystemFailure(e.getMessage());
        }
    }

}
