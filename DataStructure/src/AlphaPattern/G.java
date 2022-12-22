package AlphaPattern;

import java.util.Scanner;

public class G
{
    public static void main(String[] args) {
        int n;
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1; j <=n ; j++)
            {
                if(i==1 || i==n || (i==n/2+1)&& j>n/2)
                    System.out.print("*");
                else if(j==1 || (j==n)&& i>n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
