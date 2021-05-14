


public class Calculator
{
    public double multiply(double a, double b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Calculator calcy = new Calculator();
        System.out.println(calcy.multiply(0,7));
        System.out.println("This commit worked and is not on github!");
    }
}
