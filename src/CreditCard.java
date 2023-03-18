import java.time.LocalDate;

public class CreditCard extends Account{
    private int pin;
    private double limitAmount;
    private LocalDate truDate;
    public CreditCard(){}
    public CreditCard(String name,int number, double balance){
        super(name, number, balance);
    }
    public int getPin(){
        return pin;
    }
    public double getLimitAmount(){
        return limitAmount;
    }
    public LocalDate getTruDate(){
        return truDate;
    }
    public void setPin(int pin){
        this.pin=pin;
    }
    public void setLimitAmount(double limitAmount){
        this.limitAmount=limitAmount;
    }
    public void setTruDate(LocalDate truDate){
        this.truDate=truDate;
    }

    @Override
    protected void deposit(Double amount) {
        LocalDate now = LocalDate.now();
        if (now.isAfter((truDate))){
            System.out.println("Card is expired..!");
        }
        super.deposit(amount);
    }

    @Override
    protected void withdrawal(double amount) {

        super.withdrawal(amount);
    }

    protected void withdrawal(){
        withdrawal(getBalance());
    }
    @Override
    protected void showBalance() {
        System.out.println("****************************");
        System.out.println("Acc Name: "+getName());
        System.out.println("Number: "+getNumber());
        System.out.println("Balance: $"+getBalance());
        System.out.println("Pin: "+pin);
        System.out.println("limitAcc: $"+limitAmount);
        System.out.println("LocalDate: "+LocalDate.now());
        System.out.println("****************************");
    }

}

