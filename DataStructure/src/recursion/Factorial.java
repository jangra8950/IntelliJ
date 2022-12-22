package recursion;

public class Factorial
{
    public static void main(String[] args)
    {
        fact(5);
        System.out.println(revFact(5));
    }

    public static void fact(int n)
    {
        int f=1;
        while (n>0)
        {
            f=f*n;
            n--;
        }
        System.out.println(f);
    }

    public static int revFact(int n)
    {
        int f=1;
        if(n==1)
            return 1;
         f= n * revFact(n-1);
        return f;
    }
}
