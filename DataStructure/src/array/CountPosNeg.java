package array;

import java.util.Scanner;

public class CountPosNeg
{
    public static void main(String[] args)
    {
        int n,pos=0,neg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number for Array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " numbers");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
           if (arr[i]>=0)
               pos++;
           else
               neg++;
        }

        System.out.println("Positive numbers in the array are "+pos);
        System.out.println("Negative numbers in the arraya are "+neg);
    }
}
