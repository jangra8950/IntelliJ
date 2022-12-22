package AlphaPattern;

import java.util.Scanner;

public class J
{
    public static void main(String[] args) {
        int n,k=0;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            if(i>n/2)
                k++;
            for (int j = 1; j <=n ; j++)
            {
               if(i==1 || j==(n+1)/2 || j==k)
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}
