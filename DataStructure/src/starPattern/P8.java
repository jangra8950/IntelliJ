package starPattern;

import java.util.Scanner;

public class P8
{
    public static void main(String[] args)
    {
        int n,x;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            x=1;
            for (int j = 1; j <2*n ; j++)
            {
                if (j>=n+1-i && j<=n-1+i)
                {
                    System.out.print(x);
                    if(j<n)
                        x++;
                    else
                        x--;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
