package sort;

import java.util.Arrays;

public class Merge
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
            int mid=(l+h)/2;
            sort(a, l, mid);
            sort(a, mid + 1, h);
            merge(a,l,mid,h);
        }
    }

    public static void merge(int[] a,int l,int mid,int h)
    {
        int[] c=new int[50];
        int i=l;
        int k=l;
        int j=mid+1;
        while (i<=mid && j<=h)
        {
            if(a[i]<a[j])
                c[k++]=a[i++];
            else
                c[k++]=a[j++];
        }
        while(i<=mid)
            c[k++]=a[i++];
        while (j<=h)
            c[k++]=a[j++];
        for(i=l;i<=h;i++)
            a[i]=c[i];
    }
}
