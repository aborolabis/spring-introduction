package pl.aborolabis.springintroduction.model;

import java.math.BigDecimal;

public class Receipt {

    public static Receipt forSuccessfulCharge(BigDecimal amount){
        return null;
    }

    public static Receipt forDeclinedCharge(String message){
        return null;
    }

    public static Receipt forSystemFailure(String message){
        return null;
    }


}
