package array;

import static sort.Bubble.sort;

public class Duplicate
{
    public static void main(String[] args)
    {
       int[] arr=new int[]{1,2,3,2,5,7,9,4,3,2,5,3,1};
       dupli1(arr);
    }

    public static void dupli(int[] a)       // O(n)
    {
        int[] h=new int[10];
        for(int ele:a)
            h[ele]++;
        for(int i=0;i<10;i++)
        {
            if(h[i]>1)
                System.out.println(i+" repeating times "+h[i]);
        }
    }

    public static void dupli1(int[] a)
    {
        sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                int j=i+1;
                while(a[j]==a[i])j++;
                System.out.println(a[i]+" repeating "+(j-i));
                i=j-1;
            }
        }
    }
}
