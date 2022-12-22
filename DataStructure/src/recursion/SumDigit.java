package recursion;

public class SumDigit
{
    public static void main(String[] args)
    {
        loopDigit(455);
        System.out.println(sumDigit(456));
    }

    public static int sumDigit(int n)
    {
        if(n==0)
            return 0;
        int k=n%10;
        return k + sumDigit(n/10);
    }
    public static void loopDigit(int n)
    {
        int sum=0,k;
        while (n>0)
        {
            k=n%10;
            sum=sum+k;
            n=n/10;
        }
        System.out.println("Digit Sum is "+sum);
    }
}
