import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
       int n,fact=1;
        System.out.println(" enter the no for factorial ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial of the no is "+fact);
    }
}
