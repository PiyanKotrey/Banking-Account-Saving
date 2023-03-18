import java.time.LocalDate;

public class SavingAccount extends Account {
    private double interest;

    private Interest iterestI;

    class DefaultInterest implements Interest{
        @Override
        public double calculate(double amount) {
            return amount *0.02;
        }
    }
    public SavingAccount(){
        setInterestI(new DefaultInterest());
    }
    public SavingAccount(String name,int number, double balance){
        super(name, number, balance);
    }
    public void setInterestI(Interest interestI){
        this.iterestI=interestI;
    }
    public void setInterest(double interest){
        this.interest=interest;
    }
    public double getInterest(){
        return interest;
    }
    public void calculateInterest(){
       interest= iterestI.calculate(getBalance());
    }

    @Override
    protected void showBalance() {
        System.out.println("****************************");
        System.out.println("Acc Name: "+getName());
        System.out.println("Number: "+getNumber());
        System.out.println("Balance: $"+getBalance());
        System.out.println("Interest: "+interest);
        System.out.println("****************************");
    }
}
