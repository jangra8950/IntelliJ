package starPattern;

import java.util.Scanner;

public class P14
{
    public static void main(String[] args) {
        int n,k,y;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x=(n+1)/2;
        k=n+1;
        for (int i = 1; i <=n ; i++)
        {
            y=1;
            if(i<=x)
                k--;
            else
                k++;
            for (int j = 1; j <=n ; j++)
            {
                if (j>=k)
                    System.out.print(y++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
