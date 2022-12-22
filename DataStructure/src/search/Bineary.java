package search;

public class Bineary
{
    public static void main(String[] args) {
        int[] arr={4,1,5,8,2,6,0,9};
        System.out.println(search(arr,91));
    }

    public static int search(int[] a,int key)
    {
        int l=0;
        int h=a.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(key==a[mid])
                return mid;
            else if(key < a[mid])
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}
