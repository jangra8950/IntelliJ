package sort;

public class Selection
{
    public static void main(String[] args)
    {
       int[] arr={4,7,1,9,3,54,-1};
       sort(arr);
    }

    public static void sort(int[] a)
    {
        int i,j,k;
        for(i=0;i<a.length-1;i++)
        {
            for(j=k=i;j<a.length;j++)
            {
                if(a[j]<a[k])
                    k=j;
            }
            Bubble.swap(a,i,k);
        }
        for(i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
