package AlphaPattern;

import java.util.Scanner;

public class S
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        int x=(n+1)/2;
        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1; j <=n ; j++)
            {
               if(i==1 || i==n || i==x)
                   System.out.print("*");
               else if(j==1 && i<x || j==n && i>x)
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}
