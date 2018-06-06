package pl.aborolabis.springintroduction.model;

import java.math.BigDecimal;

public class Receipt {

    private final BigDecimal amount;
    private final boolean successful;
    private final String message;

    public Receipt(BigDecimal amount, String message, boolean successful) {
        this.amount = amount;
        this.message = message;
        this.successful = successful;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public static Receipt forSuccessfulCharge(BigDecimal amount){
        return new Receipt(amount, "", true);
    }

    public static Receipt forDeclinedCharge(String declineMessage){
        return new Receipt(BigDecimal.ZERO, declineMessage, false);
    }

    public static Receipt forSystemFailure(String message){
        return new Receipt(BigDecimal.ZERO, message, false);
    }


}
