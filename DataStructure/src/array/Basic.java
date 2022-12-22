package array;

import java.util.Arrays;
import java.util.Scanner;


public class Basic
{
    public static void main(String[] args)             // syntax:-  datatype[] variable= new datatype[size];
    {
        int n;
        Scanner sc=new Scanner(System.in);

       int []a={3,5,8,1,6};

        System.out.println("enter number of elements ");
        n=sc.nextInt();
        int []arr=new int[n];                      // arrays of primitive data type
        System.out.println("enter"+n+" digits");

       // taking input
      for(int i=0;i<arr.length;i++)
           arr[i]=sc.nextInt();

       // display
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        for (int j : arr) System.out.print(j+" ");

        change(a);                                    // arrays are mutable
        System.out.println(Arrays.toString(a));

       String[] str=new String[3];                              // arrays of objects
        for(int i=0;i< str.length;i++)
           str[i]=sc.next();

        System.out.println(Arrays.toString(str));

       // 2D Arrays

        int[][]arr2d={
                {1,2,3},           // 0th index
                {4,5},             // 1st index            arr[1][1]=5;
                {6,7,8,9}         // 2nd index
        };

        int[][]ar=new int[3][2];
        //sout(ar.length)    3
        System.out.println("enter 6 digits");

        // input
        for(int row=0;row< ar.length;row++)
        {
            for(int col=0;col<ar[row].length;col++)
                ar[row][col]= sc.nextInt();
        }

        // display
//        for(int row=0;row< ar.length;row++)
//        {
//            for(int col=0;col<ar[row].length;col++)
//                System.out.print(ar[row][col]+" ");
//            System.out.println();
//        }

        for (int[] ints : ar) {
            System.out.println(Arrays.toString(ints));
        }

    }

    static void change(int []arr)
    {
        arr[0]=99;
    }
}
