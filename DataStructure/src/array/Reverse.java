package array;

public class Reverse
{
    public static void main(String[] args)
    {
        int[] arr={2,3,1,7,5,0,8};
        reverse(arr);
    }

    public static void reverse(int[] a)
    {
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            swap(a,i,j);
            i++;
            j--;
        }
        for (int value : a)
            System.out.print(value+" ");

    }

    public static void swap(int[] a,int x,int y)
    {
        int temp;
        temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}
