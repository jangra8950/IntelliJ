package starPattern;

import java.util.Scanner;

public class P19
{
    public static void main(String[] args) {
        int n,k,x;char y;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            k=1;
            x=1;
            y='A';
            for (int j = 1; j <2*n ; j++)
            {
                if (j>=n+1-i && j<=n-1+i)
                {
                    if(k==1)
                    {
                        if(i%2==0)
                            System.out.print(y++);
                        else
                            System.out.print(x++);
                    }
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
