import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard(){
        CreditCard creditCard=new CreditCard("Kot",66667777,2000);
        creditCard.setPin(1234);
        creditCard.setLimitAmount(10000);
        creditCard.setTruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));
        return creditCard;
    }
    public static SavingAccount saving(){
        SavingAccount saving = new SavingAccount("Dara",888999,1000);
        return saving;
    }
}
