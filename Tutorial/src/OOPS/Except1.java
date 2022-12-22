package OOPS;

public class Except1                              // OUR THROW AND OUR CATCH
{
    public static void main(String[] args)
    {
        int balance=5000;
        int withdraw=3000;
        try
        {
            if(balance<withdraw)
                throw new ArithmeticException("Insufficient balance");
            balance=balance-withdraw;
            System.out.println("Transction succesful");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("program continue..");
    }
}
