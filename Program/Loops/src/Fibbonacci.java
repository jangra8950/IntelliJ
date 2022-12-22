public class Fibbonacci
{
    public static void main(String[] args)
    {
       //no(9);
       check(21);
    }

    static void no(int n)
    {
        int a,b,k;
        a=-1;
        b=1;
        while(n>0)
        {
            k=a+b;
            System.out.println(k);
            a=b;
            b=k;
            n--;
        }
    }

    static void check(int n)
    {
        int a,b,k;
        a=-1;
        b=1;
        k=a+b;
        while(n>k)
        {
            a=b;
            b=k;
            k=a+b;
        }
        if(n==k)
            System.out.println("Fibbonacci Number");
        else
            System.out.println("Not Fibonacci Number");

    }
}
