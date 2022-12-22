package starPattern;

import java.util.Scanner;

public class P6
{
    public static void main(String[] args) {
        int n;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            int k=1;
            for (int j = 1; j <2*n ; j++)
            {
                if(j>=n+1-i && j<=n-1+i)
                {
                   if(k==1)
                       System.out.print("*");
                   else
                       System.out.print(" ");
                   k=1-k;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
