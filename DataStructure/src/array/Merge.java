package array;

public class Merge
{
    public static void main(String[] args) {
        int[] a=new int[]{2,4,1,8,5};
        int[] b=new int[]{1,3,2,8};
        merge(a,b);
    }

    public static void merge(int[] a,int[] b)
    {
        int[] c=new int[30];
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length)
        {
            if(a[i]<b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];
        }
        while (i<a.length)
            c[k++]=a[i++];
        while (j<b.length)
            c[k++]=b[j++];
        for(int ele:c)
            System.out.print(ele+" ");
    }
}
