package AlphaPattern;

import java.util.Scanner;

public class X
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();

        for (int i = 1; i <2*n ; i++)
        {
            for (int j = 1; j <2*n ; j++)
            {
               if(j==i || j==2*n-i)
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}
