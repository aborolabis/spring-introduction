package pl.aborolabis.springintroduction.service;

public class TestTransactionLog implements TransactionLog {

    private ChargeResult chargeResult;

    public void logChargeResult(ChargeResult result) {
        chargeResult = result;
    }

    public void logConnectException(Exception e) {

    }
}
