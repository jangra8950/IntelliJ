package starPattern;

import java.util.Scanner;

public class P15
{
    public static void main(String[] args) {
        int n,k;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n/2+2;
        for (int i = 1; i <=n ; i++)
        {
          if(i<=(n+1)/2)
              k--;
          else
              k++;
            for (int j = 1; j <=n ; j++)
            {
                if (j<=k || j>=n+1-k)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
