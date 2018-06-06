package pl.aborolabis.springintroduction.service;

public class ChargeResult {

    private final boolean successful;
    private final String declinedMessage;

    public ChargeResult(boolean successful, String declinedMessage) {
        this.successful = successful;
        this.declinedMessage = declinedMessage;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getDeclineMessage(){
        return null;
    }
    
}
