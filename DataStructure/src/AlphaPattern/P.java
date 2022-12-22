package AlphaPattern;

import java.util.Scanner;

public class P
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
               if(i==1 || i==(n+1)/2)
                   System.out.print("*");
               else if(j==1 || (j==n && i<=(n+1)/2))
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}
