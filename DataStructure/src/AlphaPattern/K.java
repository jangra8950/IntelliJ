package AlphaPattern;

import java.util.Scanner;

public class K
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        int k=n+2;
        for (int i = 1; i <2*n ; i++)
        {
            if(i<=n)
                k--;
            else
                k++;
            for (int j = 1; j <=n+1 ; j++)
            {
               if(j==1 || j==k)
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}
