package array;

public class PairSum
{
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,6,8,9,10};
        pairSum(arr,3);
    }

    public static void pairSum(int[] a,int key)
    {
        int i=0;
        int n=a.length;
        for(i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==key)
                {
                    System.out.println(a[i]+" +"+a[j]+"=="+key);
                    break;
                }
            }
        }
        if(i==n-1)
            System.out.println("key not found");
    }
}
