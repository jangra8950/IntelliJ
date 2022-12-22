package AlphaPattern;

import java.util.Scanner;

public class D
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1; j <=n ; j++)
            {
               if((i==1 || i==n) && j!=n)
                   System.out.print("*");
               else if(j==1 || (j==n)&&(i!=1 && i!=n))
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}
