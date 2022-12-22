package array;

import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        int n,max,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Number for Array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" numbers");

        for (int i = 0; i < n; i++)
            arr[i]=sc.nextInt();

        max=arr[0];
        min=arr[0];
        for (int i = 1; i < n; i++)
        {
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }

        System.out.println("Maximum value in array is "+max);
        System.out.println("Minimun value in array is "+min);
    }


}
