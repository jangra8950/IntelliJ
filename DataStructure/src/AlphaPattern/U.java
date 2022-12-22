package AlphaPattern;

import java.util.Scanner;

public class U
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1; j <=n ; j++)
            {
               if((j==1 || j==n) && i!=n)
                   System.out.print("*");
               else if(i==n && j!=1 && j!=n)
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}
