import java.util.Scanner;

public class Factors
{
    public static void main(String[] args)
    {
        int n,i;
        System.out.println("enter the no to find factors ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
    }
}
