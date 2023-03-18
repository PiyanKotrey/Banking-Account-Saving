public class RealRate implements Interest{
    @Override
    public double calculate(double amount) {
        return amount * 0.09;
    }
}
