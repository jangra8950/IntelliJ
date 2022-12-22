class PrimeNo
{
    public static int one(int x)
    {
        int i;
        for (i = 2; i < x; i++)
        {
            if (x % i == 0)
                return 0;
        }
        return 1;
    }
    public static void two(int x, int y)
    {
        int i;
        for (i = x + 1; i < y; i++)
        {
            if (one(i) == 1)
                System.out.println(i);
        }
    }

    public static void show(int x)
    {
        int i;
        for (i = 2; i < x; i++)
        {
            if (one(i) == 1)
                System.out.println(i);
        }
    }

    public static void next(int a)
    {
        while (true)
        {
            if (one(++a) == 1)
            {
                System.out.println(a);
                break;
            }
        }
    }
    public static void getNum(int n)
    {
        int i,x=2;
        while(n>0)
        {
            if(one(x)==1)
            {
                System.out.println(x);
                n--;
            }
            x++;
        }
    }

    public static void factor(int x)
    {
        for (int i = 2; i <=x ; i++)
        {
           while (x%i==0)
           {
               System.out.println(i);
               x=x/i;
           }
        }
    }
}
public class Prime
{
    public static void main(String[] args)
    {
       // PrimeNo.two(10,50);
       // PrimeNo.show(40);
       // PrimeNo.next(17);
       // PrimeNo.getNum(5);
        PrimeNo.factor(24);
        one(18);
    }
     static void one(int x)
    {
        int i;
        for(i=2;i<x;i++)
        {
            if(x%i==0)
               break;
        }
        if(i==x)
            System.out.println(" Prime NO");
       else
            System.out.println("Not prime");
    }

}
