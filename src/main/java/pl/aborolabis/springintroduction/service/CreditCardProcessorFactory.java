package pl.aborolabis.springintroduction.service;

public class CreditCardProcessorFactory {

    private static CreditCardProcessor instance;

    public static void setInstance(CreditCardProcessor creditCardProcessor){
        instance = creditCardProcessor;
    }

    public static CreditCardProcessor getInstance() {
        return instance;
    }
}
