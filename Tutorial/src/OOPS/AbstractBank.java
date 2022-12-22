package OOPS;

abstract class Bank
{
   abstract int roi();
}

class Sbi extends Bank
{
    int roi()
    {
        return 9;
    }
}
class Axis extends Bank
{
    int roi() {
        return 7;
    }
}
public class AbstractBank
{
    public static void main(String[] args)
    {
        Bank b;
        b=new Axis();
        System.out.println(b.roi());
        b=new Sbi();
        System.out.println(b.roi());
    }
}
