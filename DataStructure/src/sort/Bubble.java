package sort;

public class Bubble
{
    public static void main(String[] args)
    {
       int[] arr={4,1,5,8,2,6,0,9};
       sort(arr);
    }
    public static void sort(int[] a)
    {
        int i,j;
        boolean x;
        for(i=0;i<a.length-1;i++)
        {
            x=false;
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                    x=true;
                }
            }
            if(x==false)
                break;
        }
        for(int ele:a)
            System.out.println(ele);
    }

    public static void swap(int[] a,int i, int j)
    {
        int t;
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
