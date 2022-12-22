package starPattern;

import java.util.Scanner;

public class P10
{
    public static void main(String[] args)
    {
        int n,k=0;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x=(n+1)/2;
        for (int i = 1; i <=n ; i++)
        {
            if(n%2==0)
            {
                if(i<=n/2)
                    k++;
                if(i>n/2+1)
                    k--;
            }
            else
            {
                if(i<=x)
                    k++;
                else
                    k--;
            }

            for (int j = 1; j <=x ; j++)
            {
                if (j<=k)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
