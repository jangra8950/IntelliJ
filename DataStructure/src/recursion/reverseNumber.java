package recursion;

public class reverseNumber
{
    public static void main(String[] args)
    {
      num(5892);
      revNum(4549);
    }

    public static void  revNum(int n)
    {
        if(n==0)
            return ;
        int k=n%10;
        System.out.print(k);
        revNum(n/10);
    }
    public static void num(int n)
    {
        int sum=0,k;
        while(n>0)
        {
            k=n%10;
            sum=sum*10+k;
            n=n/10;
        }
        System.out.println("reverse number is "+sum);
    }
}
