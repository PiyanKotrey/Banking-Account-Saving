import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.setNumber(66667777);
        creditCard.setPin(1234);
        creditCard.setLimitAmount(10000);

        if (Database.creditCard().getNumber()==(creditCard.getNumber())){
            creditCard = Database.creditCard();
        }else {
            System.out.println("Invalid Card...!");
            return;
        }
        creditCard.deposit(200.00);
        creditCard.withdrawal(100);
        creditCard.withdrawal();
        creditCard.showBalance();

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setInterestI(new RealRate());
        savingAccount.showBalance();

        SavingAccount mySaving = Database.saving();
        mySaving.setInterestI(new RealRate());
        mySaving.calculateInterest();
        System.out.println(mySaving.getInterest());

    }
}