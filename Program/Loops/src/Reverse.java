public class Reverse
{
    public static void main(String[] args)
    {
        sum(356);
        rev(52567);
        count(336625);
    }

    static void sum(int x)
    {
        int sum=0,k;
        while(x>0)
        {
            k=x%10;
            sum=sum+k;
            x=x/10;
        }
        System.out.println("sum of the digits of number is "+sum);
    }
    static void rev(int x)
    {
        int sum=0,k;
        while(x>0)
        {
            k=x%10;
            sum=sum*10+k;
            x=x/10;
        }
        System.out.println("Reverse of number is "+sum);
    }

    static void count(int x)
    {
        int sum=0,k;
        while(x>0)
        {
            k=x%10;
            sum++;
            x=x/10;
        }
        System.out.println(" number of digits  is "+sum);

    }
}
