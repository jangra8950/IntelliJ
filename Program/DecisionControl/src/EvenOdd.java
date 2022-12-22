class Leap
{
     void leap(int x)
    {
        if((x%400)==0)
            System.out.println("Leap year");
        else if ((x%100)==0)
            System.out.println("Not an Leap year");
        else if((x%4)==0)
            System.out.println("Leap year");
        else
            System.out.println("Not an Leap year");
    }
}

class Swapping
{
    static void swap(int x,int y)
    {
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("value of x after swap "+x);
        System.out.println("value of y after swap "+y);
    }
}
public class EvenOdd
{
    public static void main(String[] args)
    {
        mod(52);
        op(23);
        Leap a=new Leap();
        //a.leap(2100);
        Integer c= 10;
        Integer d= 12;
       Swapping.swap(c,d);
        System.out.println(c+" "+d);
    }

    static void mod(int x)
    {
        if(x%2==0)
            System.out.println("even number");
        else
            System.out.println("Odd number");
    }

    static void op(int x)
    {
        if((x&1)==1)
            System.out.println("Odd number");
        else
            System.out.println("Even number");
    }
}
