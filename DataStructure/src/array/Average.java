package array;

import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        int n,sum=0;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many Number of Average ");
        n=sc.nextInt();
        int[] arr=new int[n];                         // decelaring
        System.out.println(arr.length);
        System.out.println("Enter "+n+" numbers");

        //input
        for (int i = 0; i < arr.length; i++)
            arr[i]=sc.nextInt();

        for (int i = 0; i < n; i++)
            sum=sum+arr[i];
        avg=sum/n;
        System.out.println("Average is"+avg);
    }
}
