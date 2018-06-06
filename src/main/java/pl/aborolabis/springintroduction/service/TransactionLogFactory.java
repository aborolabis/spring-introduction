package pl.aborolabis.springintroduction.service;

public class TransactionLogFactory {

    private static TransactionLog instance;

    public static void setInstance(TransactionLog transactionLog) {
        instance = transactionLog;
    }

    public static TransactionLog getInstance() {
        return instance;
    }
}
