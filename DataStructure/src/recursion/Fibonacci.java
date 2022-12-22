package recursion;

public class Fibonacci
{
    static long[] a=new long[1000];
    public static void main(String[] args)
    {
       // System.out.println(fib(50));
       System.out.println(fib1(50));
    }

    public static long fib(int n)
    {
        if(n<=1)
            return n;                            // 1-n
        return fib(n-1)+fib(n-2);
    }

    public static long fib1(int n)
    {
        if(n<=1)
            return n;
        if (a[n] != 0)
            return a[n];
        else {
            a[n] = fib1(n - 1) + fib1(n - 2);
            return a[n];
        }
    }
}
