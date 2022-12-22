package recursion;

public class SumNatural
{
    public static void main(String[] args)
    {
        loopSum(5);
        System.out.println(revSum(5));
        System.out.println(revEvenSum(4));
        System.out.println(revOddSum(4));
    }

    public static int revSum(int n)
    {
        if(n==0)
            return 0;
        int s = n + revSum(n - 1);
        return s;
    }

    public static int revEvenSum(int n)
    {
        if(n==0)
            return 0;
        int s = 2*n + revEvenSum(n - 1);
        return s;
    }

    public static int revOddSum(int n)
    {
        if(n==0)
            return 0;
        int s = 2*n-1 + revOddSum(n - 1);
        return s;
    }
    public static void loopSum(int n)
    {
        int sum=0;
        for (int i = 1; i <=n ; i++)
        {
           sum=sum+i;
        }
        System.out.println(sum);
    }
}
