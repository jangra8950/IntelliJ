package recursion;

public class Counting
{
    public static void main(String[] args)
    {
         count(5);
         revCount(8);
         evenCount(7);
    }

    public static void count(int n)
    {
        if(n==0)
            return;
        count(n-1);
        System.out.print(n+" ");
    }

    public static void evenCount(int n)
    {
        if(n==0)
            return;
        evenCount(n-1);
        System.out.print(2*n+" ");
    }

    public static void revCount(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        revCount(n-1);

    }
}
