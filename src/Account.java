public abstract class Account {
    private int number;
    private String name;
    private double balance;

    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public Account(){}
    public Account(String name,int number, double balance){
        this.name=name;
        this.number=number;
        this.balance=balance;
    }

    protected void deposit(Double amount){
        if (amount<0){
            System.out.println("Juii ah na pjol luy - teh");
            return;
        }
        if (amount==0){
            System.out.println("You cannot deposit");
        }
        balance += amount;
    }
    protected void withdrawal(double amount){
        if (amount<0){
            System.out.println("Juiii");
            return;
        }
        if (amount>balance){
            System.out.println("Lers hz");
        }
        balance -= amount;
    }
     protected abstract void showBalance();
}
