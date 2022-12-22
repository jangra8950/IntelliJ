package starPattern;

import java.util.Scanner;

public class P9
{
    public static void main(String[] args)
    {
        int n;char c;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            c='A';
            for (int j = 1; j <2*n ; j++)
            {
                if (j<=n+1-i || j>=n-1+i)
                {
                    System.out.print(c);
                    if(j<n)
                        c++;
                    else
                        c--;
                }
                else
                {
                    if(j==n)
                        c--;
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
