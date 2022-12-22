package sort;

import java.util.Arrays;

public class Insertion
{
    public static void main(String[] args)
    {
        int[] arr = {4, 643, 2, 7, 54, 35, 9};
        sort(arr);
    }

  public  static void sort(int[] a)
    {
        int i, j, x;
        for (i = 1; i < a.length; i++)
        {
            x = a[i];
            for (j = i - 1; j >= 0 && a[j] > x; j--)
            {
                a[j + 1] = a[j];
            }
            a[j + 1] = x;
        }
        System.out.println(Arrays.toString(a));
    }
}