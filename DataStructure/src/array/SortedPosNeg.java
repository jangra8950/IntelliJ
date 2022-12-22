package array;

public class SortedPosNeg
{
    public static void main(String[] args) {
        int[] arr= new int[]{3,6,-6,9,-2,3,4,-1,-8};
        sep(arr);
    }

    public static void sep(int[] a)
    {
        int i=0;
        int j=a.length-1;
        while (i<j)
        {
            while (a[i]<=0) i++;
            while (a[j]>0) j--;
            if(i<j)
                Reverse.swap(a,i,j);
        }
        for(int ele:a)
            System.out.print(ele+" ");
    }
}
