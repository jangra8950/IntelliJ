package recursion;

public class Power
{
    public static void main(String[] args)
    {
        pow(2,5);
        System.out.println(recPow(2,4));
        System.out.println(impPow(2,4));
    }

    public static void pow(int a,int b)
    {
        int z=1;
        while (b>0)
        {
            z=z*a;
            b--;
        }
        System.out.println(z);
    }

    public static int recPow(int a,int b)
    {
        if(b==0)
            return 1;
        return a*recPow(a,b-1);
    }

    public static int impPow(int a,int b)
    {
        if(b==0)
            return 1;
        if(b%2==0)
            return impPow(a*a,b/2);
        else
            return a*impPow(a*a,b/2);
    }
}
