package sort;

import java.util.Arrays;

public class Quick
{
    public static void main(String[] args) {
        int[] arr={4,7,1,9,3,54,-1};
        int n= arr.length;
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] a,int l,int h)
    {
        if(l<h)
        {
            int index = part(a, l, h);
            sort(a, l, index - 1);
            sort(a, index + 1, h);
        }
    }

    public static int part(int[] a,int l,int h)
    {
        int pivot=a[l];
        int i=l;
        int j=h;
        while (i<j)
        {
            while(a[i]<=pivot)i++;
            while (a[j]>pivot)j--;
            if(i<j)
                Bubble.swap(a,i,j);
        }
        Bubble.swap(a,j,l);
        return j;
    }
}
