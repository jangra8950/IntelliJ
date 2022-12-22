package starPattern;

import java.util.Scanner;

public class P11
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {

            for (int j = 1; j <2*n ; j++)
            {
                if (j>=i && j<=2*n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
