package starPattern;

import java.util.Scanner;

public class P16
{
    public static void main(String[] args) {
        int n,x;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        char y;
        for (int i = 1; i <=n ; i++)
        {
            y='A';
            x=1;
            for (int j = 1; j <=2*n ; j++)
            {
                if (j>=n+1-i && j<=n+i)
                {
                    if(j<=n)
                        System.out.print(y++);
                    else
                    System.out.print(x++);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
